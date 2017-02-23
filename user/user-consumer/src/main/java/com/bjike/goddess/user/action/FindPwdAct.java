package com.bjike.goddess.user.action;

import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.user.entity.User;
import com.bjike.goddess.user.service.UserFindPwdAPI;
import com.bjike.goddess.user.sto.UserSimpleSTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 找回密码
 *
 * @Author: [liguiqin]
 * @Date: [2017-01-14 15:47]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@RestController
@RequestMapping("findPwd")
public class FindPwdAct {

    @Autowired
    private UserFindPwdAPI userFindPwdSer;

    /**
     * 验证码验证
     *
     * @param account
     * @param authCode
     * @return 简单的用户信息
     * @throws ActException
     */
    @GetMapping("verifyAccount")
    public ActResult verifyAccount(String account, String authCode) throws ActException {
        try {
            UserSimpleSTO simpleSTO = userFindPwdSer.verifyAccount(account, authCode);
            return ActResult.initialize(simpleSTO);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 通过昵称发送手机验证码到手机
     *
     * @param nickName
     * @return
     * @throws ActException
     */

    @GetMapping("sendCode/{nickName}")
    public ActResult sendCode(@PathVariable String nickName) throws ActException {
        try {
            Boolean result = userFindPwdSer.sendCodeByNickname(nickName);
            return ActResult.initialize(result);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }


}