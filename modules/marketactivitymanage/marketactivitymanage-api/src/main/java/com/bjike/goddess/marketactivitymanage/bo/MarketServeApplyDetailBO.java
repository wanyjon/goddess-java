package com.bjike.goddess.marketactivitymanage.bo;

import com.bjike.goddess.common.api.bo.BaseBO;
import com.bjike.goddess.marketactivitymanage.entity.CustomerInfo;
import com.bjike.goddess.marketactivitymanage.type.AuditType;

import java.util.List;

/**
 * 市场招待申请业务传输对象
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-03-18T10:37:08.039 ]
 * @Description: [ ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class MarketServeApplyDetailBO extends BaseBO {

    /**
     * 计划活动时间点
     */
    private String planActivityTiming;

    /**
     * 地区
     */
    private String area;

    /**
     * 目的
     */
    private String purpose;

    /**
     * 市场信息编号
     */
    private String marketInfoNo;

    /**
     * 项目代号
     */
    private String projectCode;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 项目性质
     */
    private String projectNature;

    /**
     * 预计参加人数
     */
    private Integer predictAttendNo;

    /**
     * 计划活动类型
     */
    private String planActivityType;

    /**
     * 分类
     */
    private String classify;

    /**
     * 预计费用
     */
    private Double predictCharge;

    /**
     * 招待负责人
     */
    private String servePrincipal;

    /**
     * 是否临时招待
     */
    private Boolean whetherTemporaryServe;

    /**
     * 运营商务部资金模块
     */
    private String yyFundModule;

    /**
     * 资金模块意见
     */
    private String fundModuleOpinion;

    /**
     * 决策层
     */
    private String decisionLevel;

    /**
     * 决策层审核意见
     */
    private AuditType executiveAuditOpinion;

    /**
     * 对应客户信息
     */
    private List<CustomerInfoBO> customerInfos;

    public String getPlanActivityTiming() {
        return planActivityTiming;
    }

    public void setPlanActivityTiming(String planActivityTiming) {
        this.planActivityTiming = planActivityTiming;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getMarketInfoNo() {
        return marketInfoNo;
    }

    public void setMarketInfoNo(String marketInfoNo) {
        this.marketInfoNo = marketInfoNo;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectNature() {
        return projectNature;
    }

    public void setProjectNature(String projectNature) {
        this.projectNature = projectNature;
    }

    public Integer getPredictAttendNo() {
        return predictAttendNo;
    }

    public void setPredictAttendNo(Integer predictAttendNo) {
        this.predictAttendNo = predictAttendNo;
    }

    public String getPlanActivityType() {
        return planActivityType;
    }

    public void setPlanActivityType(String planActivityType) {
        this.planActivityType = planActivityType;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public Double getPredictCharge() {
        return predictCharge;
    }

    public void setPredictCharge(Double predictCharge) {
        this.predictCharge = predictCharge;
    }

    public String getServePrincipal() {
        return servePrincipal;
    }

    public void setServePrincipal(String servePrincipal) {
        this.servePrincipal = servePrincipal;
    }

    public Boolean getWhetherTemporaryServe() {
        return whetherTemporaryServe;
    }

    public void setWhetherTemporaryServe(Boolean whetherTemporaryServe) {
        this.whetherTemporaryServe = whetherTemporaryServe;
    }

    public String getYyFundModule() {
        return yyFundModule;
    }

    public void setYyFundModule(String yyFundModule) {
        this.yyFundModule = yyFundModule;
    }

    public String getFundModuleOpinion() {
        return fundModuleOpinion;
    }

    public void setFundModuleOpinion(String fundModuleOpinion) {
        this.fundModuleOpinion = fundModuleOpinion;
    }

    public String getDecisionLevel() {
        return decisionLevel;
    }

    public void setDecisionLevel(String decisionLevel) {
        this.decisionLevel = decisionLevel;
    }

    public AuditType getExecutiveAuditOpinion() {
        return executiveAuditOpinion;
    }

    public void setExecutiveAuditOpinion(AuditType executiveAuditOpinion) {
        this.executiveAuditOpinion = executiveAuditOpinion;
    }

    public List<CustomerInfoBO> getCustomerInfos() {
        return customerInfos;
    }

    public void setCustomerInfos(List<CustomerInfoBO> customerInfos) {
        this.customerInfos = customerInfos;
    }
}