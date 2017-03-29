package com.bjike.goddess.annual.api;

import com.bjike.goddess.annual.bo.AnnualInfoBO;
import com.bjike.goddess.annual.service.AnnualInfoSer;
import com.bjike.goddess.common.api.exception.SerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 年假信息业务接口实现
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-03-27 03:30 ]
 * @Description: [ 年假信息业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("annualInfoApiImpl")
public class AnnualInfoApiImpl implements AnnualInfoAPI {

    @Autowired
    private AnnualInfoSer annualInfoSer;

    @Override
    public List<AnnualInfoBO> findByUsername(String username) throws SerException {
        return annualInfoSer.findByUsername(username);
    }

    @Override
    public List<AnnualInfoBO> findByUsers(String... username) throws SerException {
        return annualInfoSer.findByUsers(username);
    }

}