package com.bjike.goddess.materialsummary.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;
import com.bjike.goddess.common.api.type.Status;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;


/**
 * 地区购买情况周汇总
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-05-22 10:54 ]
 * @Description: [ 地区购买情况周汇总 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "materialsummary_areabuystatusweeksum")
public class AreaBuyStatusWeekSum extends BaseEntity {

    /**
     * 汇总起始时间
     */
    @Column(name = "sumStartTime", nullable = false, columnDefinition = "DATETIME COMMENT '汇总起始时间'")
    private LocalDateTime sumStartTime;

    /**
     * 汇总结束时间
     */
    @Column(name = "sumEndTime", nullable = false, columnDefinition = "DATETIME COMMENT '汇总结束时间'")
    private LocalDateTime sumEndTime;

    /**
     * 地区
     */
    @Column(name = "area", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '地区'")
    private String area;

    /**
     * 部门(项目组)
     */
    @Column(name = "projectGroup", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '部门(项目组)'")
    private String projectGroup;

    /**
     * 物资类型
     */
    @Column(name = "deviceType", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '物资类型'")
    private String deviceType;

    /**
     * 总数量
     */
    @Column(name = "totalQty", nullable = false, columnDefinition = "INT(11) COMMENT '总数量'")
    private Integer totalQty;

    /**
     * 总金额
     */
    @Column(name = "amoutn", nullable = false, columnDefinition = "DECIMAL(10,2) COMMENT '总金额'")
    private Double amoutn;

    /**
     * 状态
     */
    @Column(name = "status", nullable = false, columnDefinition = "TINYINT(2) DEFAULT '0' COMMENT '状态'")
    private Status status;


    public LocalDateTime getSumStartTime() {
        return sumStartTime;
    }

    public void setSumStartTime(LocalDateTime sumStartTime) {
        this.sumStartTime = sumStartTime;
    }

    public LocalDateTime getSumEndTime() {
        return sumEndTime;
    }

    public void setSumEndTime(LocalDateTime sumEndTime) {
        this.sumEndTime = sumEndTime;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProjectGroup() {
        return projectGroup;
    }

    public void setProjectGroup(String projectGroup) {
        this.projectGroup = projectGroup;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(Integer totalQty) {
        this.totalQty = totalQty;
    }

    public Double getAmoutn() {
        return amoutn;
    }

    public void setAmoutn(Double amoutn) {
        this.amoutn = amoutn;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}