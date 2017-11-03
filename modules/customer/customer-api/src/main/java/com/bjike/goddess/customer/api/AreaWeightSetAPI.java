package com.bjike.goddess.customer.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.customer.bo.AreaWeightSetBO;
import com.bjike.goddess.customer.dto.AreaWeightSetDTO;
import com.bjike.goddess.customer.to.AreaWeightSetTO;

import java.util.List;

/**
 * 地区权重设置业务接口
 *
 * @Author: [ lijuntao ]
 * @Date: [ 2017-11-01 10:19 ]
 * @Description: [ 地区权重设置业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface AreaWeightSetAPI {
    /**
     * 地区权重设置列表总条数
     */
    default Long countAreaWeight(AreaWeightSetDTO areaWeightSetDTO) throws SerException {
        return null;
    }

    /**
     * 一个地区权重设置
     */
    default AreaWeightSetBO getOneAreaWeight(String id) throws SerException {
        return null;
    }

    /**
     * 地区权重设置列表
     *
     * @return class AreaWeightSetBO
     */
    default List<AreaWeightSetBO> listAreaWeight(AreaWeightSetDTO areaWeightSetDTO) throws SerException {

        return null;
    }

    /**
     * 添加
     *
     * @param areaWeightSetTO 地区权重设置
     * @return class AreaWeightSetBO
     */
    default AreaWeightSetBO addAreaWeight(AreaWeightSetTO areaWeightSetTO) throws SerException {
        return null;
    }

    /**
     * 编辑
     *
     * @param areaWeightSetTO 地区权重设置
     * @return class AreaWeightSetBO
     */
    default AreaWeightSetBO editAreaWeight(AreaWeightSetTO areaWeightSetTO) throws SerException {
        return null;
    }

    /**
     * 删除级别
     *
     * @param id id
     */
    default void deleteAreaWeight(String id) throws SerException {
        return;
    }
}