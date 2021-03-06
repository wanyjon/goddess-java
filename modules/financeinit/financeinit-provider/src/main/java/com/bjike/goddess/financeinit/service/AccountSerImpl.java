package com.bjike.goddess.financeinit.service;

import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.provider.utils.RpcTransmit;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.financeinit.bo.AccountBO;
import com.bjike.goddess.financeinit.dto.AccountDTO;
import com.bjike.goddess.financeinit.dto.CategoryDTO;
import com.bjike.goddess.financeinit.entity.Account;
import com.bjike.goddess.financeinit.enums.GuideAddrStatus;
import com.bjike.goddess.financeinit.to.AccountTO;
import com.bjike.goddess.financeinit.to.GuidePermissionTO;
import com.bjike.goddess.user.api.UserAPI;
import com.bjike.goddess.user.bo.UserBO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 账户来源业务实现
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-03-29 04:25 ]
 * @Description: [ 账户来源业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "financeinitSerCache")
@Service
public class AccountSerImpl extends ServiceImpl<Account, AccountDTO> implements AccountSer {

    @Autowired
    private CategorySer categorySer;
    @Autowired
    private UserAPI userAPI;
    @Autowired
    private CusPermissionSer cusPermissionSer;

    /**
     * 核对查看权限（部门级别）
     */
    private void checkSeeIdentity() throws SerException {
        Boolean flag = false;
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);
        String userName = userBO.getUsername();
        if (!"admin".equals(userName.toLowerCase())) {
            flag = cusPermissionSer.getCusPermission("1");
            if (!flag) {
                throw new SerException("您不是相应财务部门的人员，不可以查看");
            }
        }
        RpcTransmit.transmitUserToken(userToken);

    }

    /**
     * 核对添加修改删除审核权限（岗位级别）
     */
    private void checkAddIdentity() throws SerException {
        Boolean flag = false;
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);
        String userName = userBO.getUsername();
        if (!"admin".equals(userName.toLowerCase())) {
            flag = cusPermissionSer.busCusPermission("2");
            if (!flag) {
                throw new SerException("您不是相应财务部门的人员，不可以操作");
            }
        }
        RpcTransmit.transmitUserToken(userToken);

    }

    /**
     * 导航栏核对查看权限（部门级别）
     */
    private Boolean guideSeeIdentity() throws SerException {
        Boolean flag = false;
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);
        String userName = userBO.getUsername();
        if (!"admin".equals(userName.toLowerCase())) {
            flag = cusPermissionSer.getCusPermission("1");
        } else {
            flag = true;
        }
        return flag;
    }

    /**
     * 导航栏核对添加修改删除审核权限（岗位级别）
     */
    private Boolean guideAddIdentity() throws SerException {
        Boolean flag = false;
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);
        String userName = userBO.getUsername();
        if (!"admin".equals(userName.toLowerCase())) {
            flag = cusPermissionSer.busCusPermission("2");
        } else {
            flag = true;
        }
        return flag;
    }

    @Override
    public Boolean sonPermission() throws SerException {
        String userToken = RpcTransmit.getUserToken();
        Boolean flagSee = guideSeeIdentity();
        RpcTransmit.transmitUserToken(userToken);
        Boolean flagAdd = guideAddIdentity();
        if( flagSee || flagAdd ){
            return true;
        } else {
            return false;
        }
    }


    @Override
    public Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        String userToken = RpcTransmit.getUserToken();
        GuideAddrStatus guideAddrStatus = guidePermissionTO.getGuideAddrStatus();
        Boolean flag = true;
        switch (guideAddrStatus) {
            case LIST:
                flag = guideSeeIdentity();
                break;
            case ADD:
                flag = guideAddIdentity();
                break;
            case EDIT:
                flag = guideAddIdentity();
                break;
            case DELETE:
                flag = guideAddIdentity();
                break;
            default:
                flag = true;
                break;
        }

        RpcTransmit.transmitUserToken(userToken);
        return flag;
    }

    @Override
    public Long countAccount(AccountDTO accountDTO) throws SerException {
        Long count = super.count(accountDTO);
        return count;
    }

    @Override
    public AccountBO getOneById(String id) throws SerException {
        if (StringUtils.isBlank(id)) {
            throw new SerException("id不能呢为空");
        }
        Account account = super.findById(id);
        return BeanTransform.copyProperties(account, AccountBO.class);
    }

    @Override
    public List<AccountBO> listAccount(AccountDTO accountDTO) throws SerException {
        checkSeeIdentity();

        List<Account> list = super.findByCis(accountDTO, true);

        List<AccountBO> cb = BeanTransform.copyProperties(list, AccountBO.class);

        return cb;
    }

    @Override
    //cjh
    public Set<String> allNames(AccountDTO accountDTO) throws SerException {
        List<Account> list = super.findByCis(accountDTO);
        List<AccountBO> cb = BeanTransform.copyProperties(list, AccountBO.class);
        Set<String> set = new HashSet<String>();
        for (AccountBO a : cb) {
            set.add(a.getName());
        }
        return set;
    }

    @Override
    //cjh
    public String findByName(String name) throws SerException {
        AccountDTO dto = new AccountDTO();
        dto.getConditions().add(Restrict.eq("name", name));
        List<Account> list = super.findByCis(dto);
        for (Account a : list) {
            return list.get(0).getAccount();
        }
        return null;
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public AccountBO addAccount(AccountTO accountTO) throws SerException {
        checkAddIdentity();

        Account account = BeanTransform.copyProperties(accountTO, Account.class, true);
        account.setCreateTime(LocalDateTime.now());
        super.save(account);
        return BeanTransform.copyProperties(account, AccountBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public AccountBO editAccount(AccountTO accountTO) throws SerException {
        checkAddIdentity();

        if (StringUtils.isBlank(accountTO.getId())) {
            throw new SerException("id为空，输入不正确");
        }
        Account account = super.findById(accountTO.getId());
        Account temp = BeanTransform.copyProperties(accountTO, Account.class, true);
        BeanUtils.copyProperties(temp, account, "id", "createTime");
        account.setModifyTime(LocalDateTime.now());
        super.update(account);
        return BeanTransform.copyProperties(account, AccountBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void deleteAccount(String id) throws SerException {
        checkAddIdentity();

        if (StringUtils.isBlank(id)) {
            throw new SerException("id为空，输入不正确");
        }
        super.remove(id);
    }

    @Override
    public List<String> getSecondSubject(AccountDTO accountDTO) throws SerException {
        if (StringUtils.isBlank(accountDTO.getFirstSubject())) {
            throw new SerException("一级级别名不能为空");
        }
        CategoryDTO cdto = new CategoryDTO();
        cdto.setFirstSubjectName(accountDTO.getFirstSubject());
        List<String> list = categorySer.getSecondSubject(cdto);
        return list;
    }

    @Override
    public List<String> getThirdSubject(AccountDTO accountDTO) throws SerException {
        if (StringUtils.isBlank(accountDTO.getFirstSubject())) {
            throw new SerException("一级级别名不能为空");
        }
        CategoryDTO cdto = new CategoryDTO();
        cdto.setFirstSubjectName(accountDTO.getFirstSubject());
        cdto.setSecondSubject(accountDTO.getSecondSubject());
        List<String> list = categorySer.getThirdSubject(cdto);
        return list;
    }

    @Override
    public List<String> listAccountOrigin() throws SerException {
        AccountDTO accountDTO = new AccountDTO();
        List<Account> list = super.findByCis(accountDTO);

        List<String> accountOrigin = list.stream().map(Account::getName).collect(Collectors.toList());
        return accountOrigin;
    }
}