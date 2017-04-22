package com.bjike.goddess.datastore.action.datastore;

import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.datastore.api.AccountPwdSpecificationAPI;
import com.bjike.goddess.datastore.bo.AccountPwdSpecificationBO;
import com.bjike.goddess.datastore.dto.AccountPwdSpecificationDTO;
import com.bjike.goddess.datastore.to.AccountPwdSpecificationTO;
import com.bjike.goddess.datastore.vo.AccountPwdSpecificationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 数据存储账号密码规范
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-04-21 06:14 ]
 * @Description: [ 数据存储账号密码规范 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("accountpwdspecification")
public class AccountPwdSpecificationAction {
    @Autowired
    private AccountPwdSpecificationAPI accountPwdSpecificationAPI;

    /**
     * 数据存储账号密码规范列表总条数
     *
     * @param accountPwdSpecificationDTO 数据存储账号密码规范dto
     * @des 获取所有数据存储账号密码规范总条数
     * @version v1
     */
    @GetMapping("v1/count")
    public Result count(AccountPwdSpecificationDTO accountPwdSpecificationDTO, BindingResult bindingResult) throws ActException {
        try {
            Long count = accountPwdSpecificationAPI.countAccountPwdSpecification(accountPwdSpecificationDTO);
            return ActResult.initialize(count);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 数据存储账号密码规范列表
     *
     * @param accountPwdSpecificationDTO 数据存储账号密码规范dto
     * @return class AccountPwdSpecificationVO
     * @des 获取所有数据存储账号密码规范
     * @version v1
     */
    @GetMapping("v1/listAccountPwdSpecification")
    public Result findListAccountPwdSpecification(AccountPwdSpecificationDTO accountPwdSpecificationDTO, BindingResult bindingResult) throws ActException {
        try {
            List<AccountPwdSpecificationVO> accountPwdSpecificationVOS = BeanTransform.copyProperties
                    (accountPwdSpecificationAPI.findListAccountPwdSpecification(accountPwdSpecificationDTO), AccountPwdSpecificationVO.class);
            return ActResult.initialize(accountPwdSpecificationVOS);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 添加数据存储账号密码规范
     *
     * @param accountPwdSpecificationTO 数据存储账号密码规范数据to
     * @return class AccountPwdSpecificationVO
     * @des 添加数据存储账号密码规范
     * @version v1
     */
    @PostMapping("v1/add")
    public Result addAccountPwdSpecification(AccountPwdSpecificationTO accountPwdSpecificationTO, BindingResult bindingResult) throws ActException {
        try {
            AccountPwdSpecificationBO accountPwdSpecificationBO = accountPwdSpecificationAPI.insertAccountPwdSpecification(accountPwdSpecificationTO);
            return ActResult.initialize(accountPwdSpecificationBO);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 编辑数据存储账号密码规范
     *
     * @param accountPwdSpecificationTO 数据存储账号密码规范数据to
     * @return class AccountPwdSpecificationVO
     * @des 编辑数据存储账号密码规范
     * @version v1
     */
    @PostMapping("v1/edit")
    public Result editAccountPwdSpecification(AccountPwdSpecificationTO accountPwdSpecificationTO) throws ActException {
        try {
            AccountPwdSpecificationBO accountPwdSpecificationBO = accountPwdSpecificationAPI.editAccountPwdSpecification(accountPwdSpecificationTO);
            return ActResult.initialize(accountPwdSpecificationBO);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 删除数据存储账号密码规范
     *
     * @param id 用户id
     * @des 根据用户id删除数据存储账号密码规范记录
     * @version v1
     */
    @DeleteMapping("v1/delete/{id}")
    public Result deleteAccountPwdSpecification(@PathVariable String id) throws ActException {
        try {
            accountPwdSpecificationAPI.removeAccountPwdSpecification(id);
            return new ActResult("delete success");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }


}