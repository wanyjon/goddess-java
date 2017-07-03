package com.bjike.goddess.projectmeasure.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.projectmeasure.bo.ProjectEvaluateResultBO;
import com.bjike.goddess.projectmeasure.bo.ProjectOtherDemandBO;
import com.bjike.goddess.projectmeasure.dto.ProjectOtherDemandDTO;
import com.bjike.goddess.projectmeasure.excel.SonPermissionObject;
import com.bjike.goddess.projectmeasure.to.GuidePermissionTO;
import com.bjike.goddess.projectmeasure.to.ProjectOtherDemandTO;

import java.util.List;

/**
 * 其他需求界面业务接口
 *
 * @Author: [ liguiqin ]
 * @Date: [ 2017-06-12 04:21 ]
 * @Description: [ 其他需求界面业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface ProjectOtherDemandAPI {

    /**
     * 分页查询其他需求界面数据
     *
     * @param dto 项目测算汇总dto
     * @return class ProjectOtherDemandBO
     * @throws SerException
     */
    default List<ProjectOtherDemandBO> findProjectOtherDemand(ProjectOtherDemandDTO dto) throws SerException {
        return null;
    }

    /**
     * 添加其他需求界面数据
     *
     * @param projectOtherDemandTO 其他需求界面
     * @return ProjectOtherDemandBO
     * @throws SerException
     */
    default ProjectOtherDemandBO add(ProjectOtherDemandTO projectOtherDemandTO) throws SerException {
        return null;
    }

    /**
     * 编辑其他需求界面数据
     *
     * @param projectOtherDemandTO 其他需求界面
     * @return ProjectOtherDemandBO
     * @throws SerException
     */
    default ProjectOtherDemandBO edit(ProjectOtherDemandTO projectOtherDemandTO) throws SerException {
        return null;
    }

    /**
     * 删除其他需求界面数据
     *
     * @param id
     * @throws SerException
     */
    default void remove(String id) throws SerException {
    }


    /**
     * 其他需求界面数据总条数
     *
     * @param projectOtherDemandDTO 其他需求界面
     * @return ProjectOtherDemandBO
     * @throws SerException
     */
    default Long count(ProjectOtherDemandDTO projectOtherDemandDTO) throws SerException {
        return null;
    }

    /**
     * 根据id查询其他需求界面数据
     *
     * @param id 其他需求界面数据唯一标识
     * @return class ProjectOtherDemandBO
     * @throws SerException
     */
    default ProjectOtherDemandBO findById(String id) throws SerException {
        return null;
    }

    /**
     * 输出评估结果
     *
     * @throws SerException
     */
    default List<ProjectEvaluateResultBO> findEvaluateResult(ProjectOtherDemandDTO demandDTO) throws SerException {
        return null;
    }

    /**
     * 下拉导航权限
     */
    default List<SonPermissionObject> sonPermission() throws SerException {
        return null;
    }

    /**
     * 导航权限
     */
    default Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        return null;
    }

    /**
     * 测试普通邮件发送
     */
    default void emailSend() throws SerException {
        return;
    }


}