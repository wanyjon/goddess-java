package com.bjike.goddess.staffmove.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;
import com.bjike.goddess.staffmove.enums.AuditorType;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * 人员调动申请
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-04-22 04:40 ]
 * @Description: [ 人员调动申请 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "staffmove_staffmovementapply")
public class StaffMovementApply extends BaseEntity {

    /**
     * 填写人
     */
    @Column(name = "fillPerson", columnDefinition = "VARCHAR(255)   COMMENT '填写人'")
    private String fillPerson;

    /**
     * 需求类型
     */
    @Column(name = "requirementType", columnDefinition = "VARCHAR(255)   COMMENT '需求类型'")
    private String requirementType;

    /**
     * 调动原因
     */
    @Column(name = "moveReason", columnDefinition = "VARCHAR(255)   COMMENT '调动原因'")
    private String moveReason;

    /**
     * 调动人员
     */
    @Column(name = "movePeople", columnDefinition = "VARCHAR(255)   COMMENT '调动人员'")
    private String movePeople;

    /**
     * 地区
     */
    @Column(name = "area", columnDefinition = "VARCHAR(255)   COMMENT '地区'")
    private String area;

    /**
     * 项目
     */
    @Column(name = "project", columnDefinition = "VARCHAR(255)   COMMENT '项目'")
    private String project;

    /**
     * 部门
     */
    @Column(name = "department",  columnDefinition = "VARCHAR(255)   COMMENT '部门'")
    private String department;

    /**
     * 岗位层级
     */
    @Column(name = "postHierarchy", columnDefinition = "VARCHAR(255)   COMMENT '岗位层级'")
    private String postHierarchy;

    /**
     * 技能情况
     */
    @Column(name = "skillIs", columnDefinition = "VARCHAR(255)   COMMENT '技能情况'")
    private String skillIs;

    /**
     * 调往地区
     */
    @Column(name = "moveArea", columnDefinition = "VARCHAR(255)   COMMENT '调往地区'")
    private String moveArea;

    /**
     * 调往项目
     */
    @Column(name = "moveProject", columnDefinition = "VARCHAR(255)   COMMENT '调往项目'")
    private String moveProject;

    /**
     * 特殊要求
     */
    @Column(name = "specialRequirement", columnDefinition = "VARCHAR(255)   COMMENT '特殊要求'")
    private String specialRequirement;

    /**
     * 计划到岗时间
     */
    @Column(name = "planArriveTime",  columnDefinition = "DATE   COMMENT '计划到岗时间'")
    private LocalDate planArriveTime;

    /**
     * 实际到岗时间
     */
    @Column(name = "actualArriveTime",columnDefinition = "DATE   COMMENT '实际到岗时间'")
    private LocalDate actualArriveTime;

    /**
     * 备注
     */
    @Column(name = "remark", columnDefinition = "VARCHAR(255)   COMMENT '备注'")
    private String remark;

    /**
     * 审核人
     */
    @Column(name = "auditor", columnDefinition = "INT(2)   COMMENT '审核人'")
    private AuditorType auditor;

    /**
     * 总经办审核意见
     */
    @Column(name = "generalAuditOpinion", columnDefinition = "VARCHAR(255)   COMMENT '总经办审核意见'")
    private String generalAuditOpinion;
    /**
     * 原决策层审核意见
     */
    @Column(name = "originalAuditOpinion", columnDefinition = "VARCHAR(255)   COMMENT '原决策层审核意见'")
    private String originalAuditOpinion;
    /**
     * 调往决策层审核意见
     */
    @Column(name = "transferAuditOpinion", columnDefinition = "VARCHAR(255)   COMMENT '调往决策层审核意见'")
    private String transferAuditOpinion;
    /**
     * 规划模块审核意见
     */
    @Column(name = "planAuditOpinion", columnDefinition = "VARCHAR(255)   COMMENT '规划模块审核意见'")
    private String planAuditOpinion;
    /**
     * 预算审核意见
     */
    @Column(name = "budgetAuditOpinion", columnDefinition = "VARCHAR(255)   COMMENT '预算审核意见'")
    private String budgetAuditOpinion;


    public String getFillPerson() {
        return fillPerson;
    }

    public void setFillPerson(String fillPerson) {
        this.fillPerson = fillPerson;
    }

    public String getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
    }

    public String getMoveReason() {
        return moveReason;
    }

    public void setMoveReason(String moveReason) {
        this.moveReason = moveReason;
    }

    public String getMovePeople() {
        return movePeople;
    }

    public void setMovePeople(String movePeople) {
        this.movePeople = movePeople;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPostHierarchy() {
        return postHierarchy;
    }

    public void setPostHierarchy(String postHierarchy) {
        this.postHierarchy = postHierarchy;
    }

    public String getSkillIs() {
        return skillIs;
    }

    public void setSkillIs(String skillIs) {
        this.skillIs = skillIs;
    }

    public String getMoveArea() {
        return moveArea;
    }

    public void setMoveArea(String moveArea) {
        this.moveArea = moveArea;
    }

    public String getMoveProject() {
        return moveProject;
    }

    public void setMoveProject(String moveProject) {
        this.moveProject = moveProject;
    }

    public String getSpecialRequirement() {
        return specialRequirement;
    }

    public void setSpecialRequirement(String specialRequirement) {
        this.specialRequirement = specialRequirement;
    }

    public LocalDate getPlanArriveTime() {
        return planArriveTime;
    }

    public void setPlanArriveTime(LocalDate planArriveTime) {
        this.planArriveTime = planArriveTime;
    }

    public LocalDate getActualArriveTime() {
        return actualArriveTime;
    }

    public void setActualArriveTime(LocalDate actualArriveTime) {
        this.actualArriveTime = actualArriveTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public AuditorType getAuditor() {
        return auditor;
    }

    public void setAuditor(AuditorType auditor) {
        this.auditor = auditor;
    }


    public String getGeneralAuditOpinion() {
        return generalAuditOpinion;
    }

    public void setGeneralAuditOpinion(String generalAuditOpinion) {
        this.generalAuditOpinion = generalAuditOpinion;
    }

    public String getOriginalAuditOpinion() {
        return originalAuditOpinion;
    }

    public void setOriginalAuditOpinion(String originalAuditOpinion) {
        this.originalAuditOpinion = originalAuditOpinion;
    }

    public String getTransferAuditOpinion() {
        return transferAuditOpinion;
    }

    public void setTransferAuditOpinion(String transferAuditOpinion) {
        this.transferAuditOpinion = transferAuditOpinion;
    }

    public String getPlanAuditOpinion() {
        return planAuditOpinion;
    }

    public void setPlanAuditOpinion(String planAuditOpinion) {
        this.planAuditOpinion = planAuditOpinion;
    }

    public String getBudgetAuditOpinion() {
        return budgetAuditOpinion;
    }

    public void setBudgetAuditOpinion(String budgetAuditOpinion) {
        this.budgetAuditOpinion = budgetAuditOpinion;
    }
}