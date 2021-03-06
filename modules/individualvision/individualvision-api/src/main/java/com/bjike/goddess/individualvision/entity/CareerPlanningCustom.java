package com.bjike.goddess.individualvision.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;
import com.bjike.goddess.common.api.type.Status;

import javax.persistence.*;
import java.time.LocalDate;


/**
 * 职业规划定制
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-03-30 06:45 ]
 * @Description: [ 职业规划定制 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "individualvision_careerplanningcustom")
public class CareerPlanningCustom extends BaseEntity {

    /**
     * 姓名
     */
    @Column(name = "name", columnDefinition = "VARCHAR(255)   COMMENT '姓名'")
    private String name;

    /**
     * 地区
     */
    @Column(name = "area", columnDefinition = "VARCHAR(255)   COMMENT '地区'")
    private String area;

    /**
     * 部门
     */
    @Column(name = "department", columnDefinition = "VARCHAR(255)   COMMENT '部门'")
    private String department;

    /**
     * 入职时间
     */
    @Column(name = "entryTime", columnDefinition = "DATE   COMMENT '入职时间'")
    private LocalDate entryTime;
    /**
     * 可提供的福利待遇
     */
    @Column(name = "availableBenefitPackage",  columnDefinition = "VARCHAR(255)   COMMENT '可提供的福利待遇'")
    private String availableBenefitPackage;

    /**
     * 薪资上升幅度
     */
    @Column(name = "expectedSalaryIncrease",  columnDefinition = "VARCHAR(255)   COMMENT '薪资上升幅度'")
    private String expectedSalaryIncrease;

    /**
     * 规划日期
     */
    @Column(name = "planningDate", columnDefinition = "DATE   COMMENT '规划日期'")
    private LocalDate planningDate;

    /**
     * 目前状态
     */
    @Column( columnDefinition = "VARCHAR(255)   COMMENT '目前状态'")
    private String currentState;

    /**
     * 选择发展路径：
     */
    @Column(name = "positive", columnDefinition = "VARCHAR(255)   COMMENT '选择发展路径：'")
    private String positive;


    /**
     * 此路径能力提升程度的选择
     */
    @Column(name = "degreeAbilityAscend",  columnDefinition = "VARCHAR(255)   COMMENT '此路径能力提升程度的选择'")
    private String degreeAbilityAscend;

    /**
     * 此时的权利及义务
     */
    @Column(name = "rightsObligations", columnDefinition = "VARCHAR(255)   COMMENT '此时的权利及义务'")
    private String rightsObligations;

    /**
     * 预计完成时间
     */
    @Column(name = "expectedCompletionTime",  columnDefinition = "DATE   COMMENT '预计完成时间'")
    private LocalDate expectedCompletionTime;

    /**
     * 实际完成时间
     */
    @Column(name = "actualCompletionTime", columnDefinition = "DATE   COMMENT '实际完成时间'")
    private LocalDate actualCompletionTime;

    /**
     * 是否按时完成
     */
    @Column(name = "is_finish", columnDefinition = "TINYINT(2) COMMENT '是否按时完成'")
    private Boolean finish;

    /**
     * 期望周收益（元）
     */
    @Column(name = "expectWeeksEarnings", columnDefinition = "VARCHAR(255)   COMMENT '期望周收益（元）'")
    private String expectWeeksEarnings;

    /**
     * 期望月收益（元）
     */
    @Column(name = "expectMonthsEarnings", columnDefinition = "VARCHAR(255)   COMMENT '期望月收益（元）'")
    private String expectMonthsEarnings;

    /**
     * 期望年收益（元）
     */
    @Column(name = "expectYearsEarnings", columnDefinition = "VARCHAR(255)   COMMENT '期望年收益（元）'")
    private String expectYearsEarnings;

    /**
     * 实际周收益（元）
     */
    @Column(name = "actualWeeksEarnings", columnDefinition = "VARCHAR(255)   COMMENT '实际周收益（元）'")
    private String actualWeeksEarnings;

    /**
     * 实际月收益（元）
     */
    @Column(name = "actualMonthsEarnings", columnDefinition = "VARCHAR(255)   COMMENT '实际月收益（元）'")
    private String actualMonthsEarnings;

    /**
     * 实际年收益（元）
     */
    @Column(name = "actualYearsEarnings", columnDefinition = "VARCHAR(255)   COMMENT '实际年收益（元）'")
    private String actualYearsEarnings;

    private String notUpStandard; //未达标项内容
    private String completeDegree;//此定制项完成程度
    private String standard;//此定制项标准
    private String surplusTime;//剩余时间

    public String getAvailableBenefitPackage() {
        return availableBenefitPackage;
    }

    public void setAvailableBenefitPackage(String availableBenefitPackage) {
        this.availableBenefitPackage = availableBenefitPackage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDate entryTime) {
        this.entryTime = entryTime;
    }

    public String getExpectedSalaryIncrease() {
        return expectedSalaryIncrease;
    }

    public void setExpectedSalaryIncrease(String expectedSalaryIncrease) {
        this.expectedSalaryIncrease = expectedSalaryIncrease;
    }

    public LocalDate getPlanningDate() {
        return planningDate;
    }

    public void setPlanningDate(LocalDate planningDate) {
        this.planningDate = planningDate;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public String getPositive() {
        return positive;
    }

    public void setPositive(String positive) {
        this.positive = positive;
    }

    public String getDegreeAbilityAscend() {
        return degreeAbilityAscend;
    }

    public void setDegreeAbilityAscend(String degreeAbilityAscend) {
        this.degreeAbilityAscend = degreeAbilityAscend;
    }

    public String getRightsObligations() {
        return rightsObligations;
    }

    public void setRightsObligations(String rightsObligations) {
        this.rightsObligations = rightsObligations;
    }

    public LocalDate getExpectedCompletionTime() {
        return expectedCompletionTime;
    }

    public void setExpectedCompletionTime(LocalDate expectedCompletionTime) {
        this.expectedCompletionTime = expectedCompletionTime;
    }

    public LocalDate getActualCompletionTime() {
        return actualCompletionTime;
    }

    public void setActualCompletionTime(LocalDate actualCompletionTime) {
        this.actualCompletionTime = actualCompletionTime;
    }

    public Boolean getFinish() {
        return finish;
    }

    public void setFinish(Boolean finish) {
        this.finish = finish;
    }

    public String getExpectWeeksEarnings() {
        return expectWeeksEarnings;
    }

    public void setExpectWeeksEarnings(String expectWeeksEarnings) {
        this.expectWeeksEarnings = expectWeeksEarnings;
    }

    public String getExpectMonthsEarnings() {
        return expectMonthsEarnings;
    }

    public void setExpectMonthsEarnings(String expectMonthsEarnings) {
        this.expectMonthsEarnings = expectMonthsEarnings;
    }

    public String getExpectYearsEarnings() {
        return expectYearsEarnings;
    }

    public void setExpectYearsEarnings(String expectYearsEarnings) {
        this.expectYearsEarnings = expectYearsEarnings;
    }

    public String getActualWeeksEarnings() {
        return actualWeeksEarnings;
    }

    public void setActualWeeksEarnings(String actualWeeksEarnings) {
        this.actualWeeksEarnings = actualWeeksEarnings;
    }

    public String getActualMonthsEarnings() {
        return actualMonthsEarnings;
    }

    public void setActualMonthsEarnings(String actualMonthsEarnings) {
        this.actualMonthsEarnings = actualMonthsEarnings;
    }

    public String getActualYearsEarnings() {
        return actualYearsEarnings;
    }

    public void setActualYearsEarnings(String actualYearsEarnings) {
        this.actualYearsEarnings = actualYearsEarnings;
    }

    public String getNotUpStandard() {
        return notUpStandard;
    }

    public void setNotUpStandard(String notUpStandard) {
        this.notUpStandard = notUpStandard;
    }

    public String getCompleteDegree() {
        return completeDegree;
    }

    public void setCompleteDegree(String completeDegree) {
        this.completeDegree = completeDegree;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getSurplusTime() {
        return surplusTime;
    }

    public void setSurplusTime(String surplusTime) {
        this.surplusTime = surplusTime;
    }
}