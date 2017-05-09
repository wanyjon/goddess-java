package com.bjike.goddess.businessproject.api;

import com.bjike.goddess.businessproject.bo.BaseInfoManageBO;
import com.bjike.goddess.businessproject.dto.BaseInfoManageDTO;
import com.bjike.goddess.businessproject.to.BaseInfoManageTO;
import com.bjike.goddess.common.api.exception.SerException;

import java.util.List;

/**
 * 商务项目合同基本信息管理业务接口
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-03-20T20:34:51.347 ]
 * @Description: [ 商务项目合同基本信息管理业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface BaseInfoManageAPI {

    /**
     * 项目合同基本信息列表
     * @return class BaseInfoManageBO
     */
    default List<BaseInfoManageBO> listBaseInfoManage(BaseInfoManageDTO baseInfoManageDTO) throws SerException {return null;}
    /**
     *  添加
     * @param baseInfoManageTO 项目合同基本信息
     * @return class BaseInfoManageBO
     */
    default BaseInfoManageBO addBaseInfoManage(BaseInfoManageTO baseInfoManageTO) throws SerException { return null;}

    /**
     *  编辑
     * @param baseInfoManageTO 项目合同基本信息
     * @return class BaseInfoManageBO
     */
    default BaseInfoManageBO editBaseInfoManage(BaseInfoManageTO baseInfoManageTO) throws SerException { return null;}

    /**
     * 删除
     * @param id id
     */
    default void deleteBaseInfoManage(String id ) throws SerException {return;};

    /**
     *  根据内部项目编号查找项目合同基本信息
     * @param innerProjectNum 内部项目编号
     * @return class BaseInfoManageBO
     */
    default BaseInfoManageBO getInfoByInnerProjectNum(String innerProjectNum) throws SerException { return null;}

    /**
     * 搜索
     * @param baseInfoManageDTO 搜索
     * @return class BaseInfoManageBO
     */
    default List<BaseInfoManageBO> searchSiginManage(BaseInfoManageDTO baseInfoManageDTO) throws  SerException {
        return null;
    }

    /**
     * 获取甲方公司
     * @return class String
     */
    default List<String> listFirstCompany( ) throws  SerException {
        return null;
    }


}