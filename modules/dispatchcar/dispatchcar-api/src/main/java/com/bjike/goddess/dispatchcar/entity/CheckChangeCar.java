package com.bjike.goddess.dispatchcar.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
* 出车核对修改记录
* @Author:			[ jiangzaixuan ]
* @Date:			[  2017-09-25 11:24 ]
* @Description:	[ 出车核对修改记录 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
@Entity
@Table(name = "dispatchcar_checkchangecar")
public class CheckChangeCar extends BaseEntity {
    /**
     * 用车人
     */
    @Column(name = "carUser",nullable = false,columnDefinition = "VARCHAR(255)   COMMENT '用车人'"  )
    private String  carUser;

    /**
     * 出车日期
     */
    @Column(name = "dispatchDate",nullable = false,columnDefinition = "DATE   COMMENT '出车日期'"  )
    private LocalDate dispatchDate;

    /**
     * 出车单号
     */
    @Column(name = "number",nullable = false,columnDefinition = "VARCHAR(255)   COMMENT '出车单号'"  )
    private String  number;

    /**
     * 修改日期
     */
    @Column(name = "modifyDate",nullable = false,columnDefinition = "DATE   COMMENT '修改日期'"  )
    private LocalDate  modifyDate;

    /**
     * 修改人
     */
    @Column(name = "modifier",nullable = false,columnDefinition = "VARCHAR(255)   COMMENT '修改人'"  )
    private String  modifier;

    /**
     * 内容
     */
    @Column(name = "content",nullable = false,columnDefinition = "VARCHAR(255)   COMMENT '内容'"  )
    private String  content;

    /**
     * 问题类型
     */
    @Column(name = "problemType",nullable = false,columnDefinition = "VARCHAR(255)   COMMENT '问题类型'"  )
    private String  problemType;

    /**
     * 问题描述
     */
    @Column(name = "problemDes",nullable = false,columnDefinition = "VARCHAR(255)   COMMENT '问题描述'"  )
    private String  problemDes;

    /**
     * 是否解决
     */
    @Column(name = "is_ifSolve",columnDefinition = "TINYINT(1)  DEFAULT 0  COMMENT '是否解决'"  , insertable = false  )
    private Boolean  ifSolve;

    /**
     * 解决方案
     */
    @Column(name = "solution",columnDefinition = "VARCHAR(255)   COMMENT '解决方案'"  )
    private String  solution;

    /**
     * 解决时间
     */
    @Column(name = "solutionTime" ,columnDefinition = "DATETIME   COMMENT '解决时间'"  )
    private LocalDateTime solutionTime;


    public String getCarUser() {
        return carUser;
    }

    public void setCarUser(String carUser) {
        this.carUser = carUser;
    }

    public LocalDate getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(LocalDate dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(LocalDate modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    public String getProblemDes() {
        return problemDes;
    }

    public void setProblemDes(String problemDes) {
        this.problemDes = problemDes;
    }

    public Boolean getIfSolve() {
        return ifSolve;
    }

    public void setIfSolve(Boolean ifSolve) {
        this.ifSolve = ifSolve;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public LocalDateTime getSolutionTime() {
        return solutionTime;
    }

    public void setSolutionTime(LocalDateTime solutionTime) {
        this.solutionTime = solutionTime;
    }
}