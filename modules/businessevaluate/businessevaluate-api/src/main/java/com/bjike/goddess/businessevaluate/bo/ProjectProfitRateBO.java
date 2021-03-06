package com.bjike.goddess.businessevaluate.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

/**
 * 项目利润率
 *
 * @Author: [Jason]
 * @Date: [17-3-28 下午2:46]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class ProjectProfitRateBO extends BaseBO {
    /**
     * 地区
     */
    private String area;

    /**
     * 项目名称
     */
    private String project;

    /**
     * 工期开始时间
     */
    private String startTime;

    /**
     * 工期结束时间
     */
    private String endTime;

    /**
     * 项目利润
     */
    private Double profit;

    /**
     * 项目利润率含百分号
     */
    private String projectProfitRate;

    /**
     * 项目利润率
     */
    private Double projectProfitRateNum;

    /**
     * 成本利润率
     */
    private String costProfitRate;

    /**
     * 费用利润率
     */
    private String feeProfitRate;

    /**
     * 存放汇总中的行标题字段
     */
    private String totalTitle;

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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public String getProjectProfitRate() {
        return projectProfitRate;
    }

    public void setProjectProfitRate(String projectProfitRate) {
        this.projectProfitRate = projectProfitRate;
    }

    public String getCostProfitRate() {
        return costProfitRate;
    }

    public void setCostProfitRate(String costProfitRate) {
        this.costProfitRate = costProfitRate;
    }

    public String getFeeProfitRate() {
        return feeProfitRate;
    }

    public void setFeeProfitRate(String feeProfitRate) {
        this.feeProfitRate = feeProfitRate;
    }

    public Double getProjectProfitRateNum() {
        return projectProfitRateNum;
    }

    public void setProjectProfitRateNum(Double projectProfitRateNum) {
        this.projectProfitRateNum = projectProfitRateNum;
    }

    public String getTotalTitle() {
        return totalTitle;
    }

    public void setTotalTitle(String totalTitle) {
        this.totalTitle = totalTitle;
    }

    public ProjectProfitRateBO() {
    }

    public ProjectProfitRateBO(String totalTitle , String area, String project, String startTime, String endTime, String projectProfitRate) {
        this.totalTitle = totalTitle;
        this.area = area;
        this.project = project;
        this.startTime = startTime;
        this.endTime = endTime;
        this.projectProfitRate = projectProfitRate;
    }
}
