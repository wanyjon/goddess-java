package com.bjike.goddess.assistance.api;

import com.bjike.goddess.assistance.bo.RightSetBO;
import com.bjike.goddess.assistance.dto.RightSetDTO;
import com.bjike.goddess.assistance.to.RightSetTO;
import com.bjike.goddess.common.api.exception.SerException;

import java.util.List;

/**
 * 权限设置业务接口
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-04-14 10:14 ]
 * @Description: [ 权限设置业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface RightSetAPI {

    /**
     * 权限设置列表总条数
     *
     */
    default Long countRightSet(RightSetDTO rightSetDTO) throws SerException {
        return null;
    }
    /**
     * 权限设置列表
     * @return class RightSetBO
     */
    default List<RightSetBO> listRightSet(RightSetDTO rightSetDTO) throws SerException {return null;}
    /**
     *  添加
     * @param rightSetTO 权限设置信息
     * @return class RightSetBO
     */
    default RightSetBO addRightSet(RightSetTO rightSetTO) throws SerException { return null;}

    /**
     *  编辑
     * @param rightSetTO 权限设置信息
     * @return class RightSetBO
     */
    default RightSetBO editRightSet(RightSetTO rightSetTO) throws SerException { return null;}

    /**
     * 删除级别
     * @param id id
     */
    default void deleteRightSet(String id ) throws SerException {return;};


    
}