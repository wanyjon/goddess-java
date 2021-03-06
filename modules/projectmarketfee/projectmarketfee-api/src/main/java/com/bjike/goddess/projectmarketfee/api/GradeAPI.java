package com.bjike.goddess.projectmarketfee.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.projectmarketfee.bo.GradeBO;
import com.bjike.goddess.projectmarketfee.dto.CostAnalysisDTO;
import com.bjike.goddess.projectmarketfee.dto.GradeDTO;
import com.bjike.goddess.projectmarketfee.entity.Grade;
import com.bjike.goddess.projectmarketfee.to.GradeTO;
import com.bjike.goddess.projectmarketfee.to.GuidePermissionTO;

import java.util.List;

/**
 * 等级设计业务接口
 *
 * @Author: [ chenjunhao ]
 * @Date: [ 2017-05-09 04:55 ]
 * @Description: [ 等级设计业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface GradeAPI {
    /**
     * 下拉导航权限
     */
    Boolean sonPermission() throws SerException;

    /**
     * 导航权限
     */
    Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException;

    /**
     * 添加
     *
     * @param to 等级设计信息
     * @return class GradeBO
     * @throws SerException
     */
    default GradeBO save(GradeTO to) throws SerException {
        return null;
    }

    /**
     * 编辑
     *
     * @param to 等级设计信息
     * @throws SerException
     */
    default void edit(GradeTO to) throws SerException {
    }

    /**
     * 分页查找
     *
     * @param dto 等级设计分页信息
     * @return class GradeBO
     * @throws SerException
     */
    default List<GradeBO> list(GradeDTO dto) throws SerException {
        return null;
    }

    /**
     * 删除
     *
     * @param id 等级设计id
     * @throws SerException
     */
    default void delete(String id) throws SerException {
    }

    /**
     * 通过id查找
     *
     * @param id 等级设计id
     * @return class GradeBO
     * @throws SerException
     */
    default GradeBO findByID(String id) throws SerException {
        return null;
    }

    /**
     * 查找总记录数
     *
     * @param dto 预警信息
     * @return class GradeBO
     * @throows SerException
     */
    default GradeBO countNum(GradeDTO dto) throws SerException {
        return null;
    }
}