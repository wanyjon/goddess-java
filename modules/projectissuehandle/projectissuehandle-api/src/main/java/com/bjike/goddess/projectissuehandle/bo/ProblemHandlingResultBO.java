package com.bjike.goddess.projectissuehandle.bo;

import com.bjike.goddess.common.api.bo.BaseBO;
import com.bjike.goddess.projectissuehandle.enums.ProblemObject;
import com.bjike.goddess.projectissuehandle.enums.ProblemProcessingResult;


/**
 * 确认问题处理结果业务传输对象
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-03-23 04:30 ]
 * @Description: [ 确认问题处理结果业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class ProblemHandlingResultBO extends BaseBO {

    /**
     * 年份
     */
    private String year;

    /**
     * 合同外部项目名称
     */
    private String ExternalContractProjectName;

    /**
     * 内部项目名称
     */
    private String internalProjectName;

    /**
     * 工程类型
     */
    private String projectType;

    /**
     * 问题受理时间
     */
    private String problemAcceptTime;

    /**
     * 问题具体情况
     */
    private String problemSpecificSituation;

    /**
     * 问题对象
     */
    private ProblemObject problemObject;

    /**
     * 问题责任人员
     */
    private String problemResponsible;

    /**
     * 问题处理人员
     */
    private String problemHandler;

    /**
     * 问题相关部门
     */
    private String problemRelevantDepartment;

    /**
     * 问题发生时间
     */
    private String problemOccurrenceTime;

    /**
     * 问题发生地点
     */
    private String problemOccurrencePlace;

    /**
     * 问题解决时间
     */
    private String problemSolveTime;

    /**
     * 问题处理结果
     */
    private ProblemProcessingResult problemProcessingResult;

    /**
     * 问题总结
     */
    private String problemConclusion;


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getExternalContractProjectName() {
        return ExternalContractProjectName;
    }

    public void setExternalContractProjectName(String ExternalContractProjectName) {
        this.ExternalContractProjectName = ExternalContractProjectName;
    }

    public String getInternalProjectName() {
        return internalProjectName;
    }

    public void setInternalProjectName(String internalProjectName) {
        this.internalProjectName = internalProjectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProblemAcceptTime() {
        return problemAcceptTime;
    }

    public void setProblemAcceptTime(String problemAcceptTime) {
        this.problemAcceptTime = problemAcceptTime;
    }

    public String getProblemSpecificSituation() {
        return problemSpecificSituation;
    }

    public void setProblemSpecificSituation(String problemSpecificSituation) {
        this.problemSpecificSituation = problemSpecificSituation;
    }

    public ProblemObject getProblemObject() {
        return problemObject;
    }

    public void setProblemObject(ProblemObject problemObject) {
        this.problemObject = problemObject;
    }

    public String getProblemResponsible() {
        return problemResponsible;
    }

    public void setProblemResponsible(String problemResponsible) {
        this.problemResponsible = problemResponsible;
    }

    public String getProblemHandler() {
        return problemHandler;
    }

    public void setProblemHandler(String problemHandler) {
        this.problemHandler = problemHandler;
    }

    public String getProblemRelevantDepartment() {
        return problemRelevantDepartment;
    }

    public void setProblemRelevantDepartment(String problemRelevantDepartment) {
        this.problemRelevantDepartment = problemRelevantDepartment;
    }

    public String getProblemOccurrenceTime() {
        return problemOccurrenceTime;
    }

    public void setProblemOccurrenceTime(String problemOccurrenceTime) {
        this.problemOccurrenceTime = problemOccurrenceTime;
    }

    public String getProblemOccurrencePlace() {
        return problemOccurrencePlace;
    }

    public void setProblemOccurrencePlace(String problemOccurrencePlace) {
        this.problemOccurrencePlace = problemOccurrencePlace;
    }

    public String getProblemSolveTime() {
        return problemSolveTime;
    }

    public void setProblemSolveTime(String problemSolveTime) {
        this.problemSolveTime = problemSolveTime;
    }

    public ProblemProcessingResult getProblemProcessingResult() {
        return problemProcessingResult;
    }

    public void setProblemProcessingResult(ProblemProcessingResult problemProcessingResult) {
        this.problemProcessingResult = problemProcessingResult;
    }

    public String getProblemConclusion() {
        return problemConclusion;
    }

    public void setProblemConclusion(String problemConclusion) {
        this.problemConclusion = problemConclusion;
    }
}