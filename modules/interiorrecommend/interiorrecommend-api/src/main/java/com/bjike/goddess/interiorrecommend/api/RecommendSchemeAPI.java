package com.bjike.goddess.interiorrecommend.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.interiorrecommend.bo.RecommendSchemeBO;
import com.bjike.goddess.interiorrecommend.dto.RecommendSchemeDTO;
import com.bjike.goddess.interiorrecommend.to.RecommendSchemeTO;

import java.util.List;

/**
 * 推荐方案业务接口
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-04-09 10:31 ]
 * @Description: [ 推荐方案业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface RecommendSchemeAPI {

    /**
     * 新增推荐方案
     *
     * @param to 推荐方案
     * @return 推荐方案
     */
    RecommendSchemeBO addModel(RecommendSchemeTO to) throws SerException;

    /**
     * 编辑推荐方案
     *
     * @param to 推荐方案
     * @return 推荐方案
     */
    RecommendSchemeBO editModel(RecommendSchemeTO to) throws SerException;

    /**
     * 删除推荐方案
     *
     * @param id 推荐方案id
     */
    void delete(String id) throws SerException;

    /**
     * 分页查询推荐方案
     *
     * @param dto 推荐方案
     * @return 推荐方案结果集
     */
    List<RecommendSchemeBO> pageList(RecommendSchemeDTO dto) throws SerException;


    /**
     * 综合资源部审核
     *
     * @param id               id
     * @param resourcesSuggest 意见
     * @param resourcesAudit   结果
     */
    void resourcesAudit(String id, String resourcesSuggest, Boolean resourcesAudit) throws SerException;

    /**
     * 运营商务部审核
     *
     * @param id             id
     * @param operateSuggest 意见
     * @param operateAudit   结果
     */
    void operateAudit(String id, String operateSuggest, Boolean operateAudit) throws SerException;

    /**
     * 总经办审核
     *
     * @param id             id
     * @param generalSuggest 意见
     * @param generalAudit   结果
     */
    void generalAudit(String id, String generalSuggest, Boolean generalAudit) throws SerException;

    /**
     * 根据Id查询
     *
     * @param id id
     */
    RecommendSchemeBO findById(String id) throws SerException;

    /**
     * 查询总记录数
     *
     * @param dto 查询条件
     */
    Long count(RecommendSchemeDTO dto) throws SerException;
}