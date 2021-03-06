package com.bjike.goddess.oilcardmanage.vo;

import com.bjike.goddess.common.api.type.Status;

/**
 * @Author: [Jason]
 * @Date: [17-3-15 上午10:50]
 * @Package:[ com.bjike.goddess.oilcardmanage.vo ]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class OilCardRechargeVO {

    /**
     * id
     */
    private String id;

    /**
     * 油卡编号
     */
    private String oilCardCode;

    /**
     * 卡号
     */
    private String oilCardNumber;

    /**
     * 充值日期
     */
    private String rechargeDate;

    /**
     * 充值金额
     */
    private Double rechargeMoney;

    /**
     * 充值人
     */
    private String rechargeUser;

    /**
     * 充值方式
     */
    private String rechargeWay;

    /**
     * 期初金额
     */
    private Double cycleEarlyMoney;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRechargeDate() {
        return rechargeDate;
    }

    public void setRechargeDate(String rechargeDate) {
        this.rechargeDate = rechargeDate;
    }

    public Double getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(Double rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public String getRechargeUser() {
        return rechargeUser;
    }

    public void setRechargeUser(String rechargeUser) {
        this.rechargeUser = rechargeUser;
    }

    public String getRechargeWay() {
        return rechargeWay;
    }

    public void setRechargeWay(String rechargeWay) {
        this.rechargeWay = rechargeWay;
    }

    public Double getCycleEarlyMoney() {
        return cycleEarlyMoney;
    }

    public void setCycleEarlyMoney(Double cycleEarlyMoney) {
        this.cycleEarlyMoney = cycleEarlyMoney;
    }

    public String getOilCardCode() {
        return oilCardCode;
    }

    public void setOilCardCode(String oilCardCode) {
        this.oilCardCode = oilCardCode;
    }

    public String getOilCardNumber() {
        return oilCardNumber;
    }

    public void setOilCardNumber(String oilCardNumber) {
        this.oilCardNumber = oilCardNumber;
    }
}
