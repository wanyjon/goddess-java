package com.bjike.goddess.user.service;


import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.utils.PasswordHash;
import com.bjike.goddess.user.dto.UserLoginDTO;
import com.bjike.goddess.user.entity.User;
import com.bjike.goddess.user.enums.LoginStatus;
import com.bjike.goddess.user.session.authcode.AuthCode;
import com.bjike.goddess.user.session.authcode.AuthCodeSession;
import com.bjike.goddess.user.session.validcorrect.UserSession;
import com.bjike.goddess.user.session.validfail.ValidErrSession;
import com.bjike.goddess.user.utils.TokenUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @Author: [liguiqin]
 * @Date: [2016-11-24 09:37]
 * @Description: [用户登陆业务实现]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@Service("userLoginSer")
public class UserLoginSerImpl implements IUserLoginSer {

    private IUserSer userSer;


    @Override
    public Boolean verify(String token) throws SerException {
        if (TokenUtils.verify(token)) {//token 可能来自不同ip，不同客户端
            User user = UserSession.getUser(token);
            if (null != user && user.getLoginStatus().equals(LoginStatus.LOGIN)) {
                return true;
            }
            return false;
        }
        throw new SerException("token无效");
    }

    @Override
    public String login(UserLoginDTO dto) throws SerException {

        String token = null;
        String account = dto.getAccount();
        dto.setIp("192.168.0.1");
        User user = userSer.findByAccountNumber(account); //通过用户名/手机号/或者邮箱查找用户
        if (null != user) {
            boolean authCode = validateAuthCode(account, dto.getAuthCode());
            if (authCode) { //验证码正确
                token = validatePassword(dto, user);  //验证密码
                if (StringUtils.isNotBlank(token)) { //登录成功处理业务
                    ValidErrSession.remove(account); //清除密码输错会话
                    //AuthCodeSession.remove(account);//清除验证码
                    //记录登录日志

                } else {
                    throw new SerException("账号或者密码错误");
                }
            } else {
                throw new SerException("验证码错误");
            }
        }
        return token;
    }

    /**
     * 验证登陆密码
     *
     * @param dto
     */
    private String validatePassword(UserLoginDTO dto, User persistUser) throws SerException {
        String token = null;
        String account = dto.getAccount();
        try {
            if (PasswordHash.validatePassword(dto.getPassword(), persistUser.getPassword())) {
                UserSession.removeByUsername(persistUser.getUsername());
                token = TokenUtils.create(dto.getIp(), persistUser.getUsername());
                persistUser.setLoginStatus(LoginStatus.LOGIN);
//                UserSession.put(token, persistUser);
                ValidErrSession.remove(account);//删除密码验证错误次数统计
            } else { //密码错误
                ValidErrSession.putValidErr(account);
            }

        } catch (Exception e) {
            throw new SerException(e.getMessage());
        }
        return token;
    }

    /**
     * 验证 验证码
     *
     * @param account
     * @param authCode
     * @return
     */
    private boolean validateAuthCode(String account, String authCode) {
        AuthCode auth = AuthCodeSession.get(account);
        boolean pass = false;
        if (null == auth) {
            pass = true;
        } else {
            if (auth.getCode().equals(authCode)) {
                pass = true;
            }
        }
        return pass;
    }

    @Override
    public Boolean loginOut(String token) throws SerException {
        User user = UserSession.getUser(token);
        if (null != user) {
            user.setLoginStatus(LoginStatus.LOGINOUT);
        }
        return true;
    }


}