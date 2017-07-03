package com.bjike.goddess.projectroyalty.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.projectroyalty.bo.CompletionTimeBO;
import com.bjike.goddess.projectroyalty.bo.OpinionBO;
import com.bjike.goddess.projectroyalty.dto.CompletionTimeDTO;
import com.bjike.goddess.projectroyalty.to.CompletionTimeTO;

import java.util.List;

/**
 * 完工时间业务接口
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-06-07 09:44 ]
 * @Description: [ 完工时间业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface CompletionTimeAPI {

    /**
     * 保存
     *
     * @param to 完工时间传输对象
     * @return
     * @throws SerException
     */
    default CompletionTimeBO save(CompletionTimeTO to) throws SerException {
        return null;
    }

    /**
     * 修改
     *
     * @param to 完工时间传输对象
     * @return
     * @throws SerException
     */
    default CompletionTimeBO update(CompletionTimeTO to) throws SerException {
        return null;
    }

    /**
     * 删除
     *
     * @param id 完工时间数据id
     * @return
     * @throws SerException
     */
    default CompletionTimeBO delete(String id) throws SerException {
        return null;
    }

    /**
     * 根据id获取完工时间数据
     *
     * @param id 完工时间数据id
     * @return
     * @throws SerException
     */
    default CompletionTimeBO getById(String id) throws SerException {
        return null;
    }

    /**
     * 列表
     *
     * @param dto 完工时间数据传输对象
     * @return
     * @throws SerException
     */
    default List<CompletionTimeBO> maps(CompletionTimeDTO dto) throws SerException {
        return null;
    }

    /**
     * 获取完工时间选项
     *
     * @return
     * @throws SerException
     */
    default List<OpinionBO> findOpinion() throws SerException {
        return null;
    }

    /**
     * 获取总条数
     *
     * @return
     * @throws SerException
     */
    default Long getTotal() throws SerException {
        return null;
    }


}