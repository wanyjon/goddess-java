package com.bjike.goddess.accommodation.api;

import com.bjike.goddess.accommodation.bo.RentalPreceptBO;
import com.bjike.goddess.accommodation.dto.RentalPreceptDTO;
import com.bjike.goddess.accommodation.to.RentalPreceptTO;
import com.bjike.goddess.common.api.exception.SerException;

import java.util.List;

/**
 * @Author: [xiazhili]
 * @Date: [2017-3-11 10:16]
 * @Description: [租房方案接口]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public interface RentalPreceptAPI {
    /**
     * 添加租房方案
     * @param preceptTO 租房方案数据集合
     * @throws SerException
     */
    default RentalPreceptBO insertPecept(RentalPreceptTO preceptTO) throws SerException {
        return null;
    }
    /**
     * 编辑租房方案
     *
     * @param preceptTO   租房方案信息数据to
     * @return class rentalPreceptBO
     * @throws SerException
     */
    default RentalPreceptBO editPecept(RentalPreceptTO preceptTO ) throws SerException {
        return null;
    }


    /**
     * 根据id删除租房方案
     *
     * @param id
     * @throws SerException
     */
    default void removePecept(String id) throws SerException {
        return;
    }
    /**
     * 获取所有租房方案
     * @param rentalPreceptDTO 租房方案dto
     * @return class entryBasicInfo
     * @throws SerException
     */
    default List<RentalPreceptBO> listRentalPrecept(RentalPreceptDTO rentalPreceptDTO) throws SerException {
        return null;
    }


    /**
     * 审核
     * @param preceptTO
     * @throws SerException
     */
    default  void audit(RentalPreceptTO preceptTO) throws SerException{
        return ;
    }
    /**
     * 邮箱
     * @param preceptTO
     * @throws SerException
     */
    default RentalPreceptBO mail(RentalPreceptTO preceptTO) throws SerException{
        return null;
    }


}