package com.bjike.goddess.foreigntax.to;

import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.to.BaseTO;
import com.bjike.goddess.foreigntax.enums.PaymentStatus;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * 税金管理
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-04-19 01:40 ]
 * @Description: [ 税金管理 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class TaxManagementTO extends BaseTO {

    /**
     * 公司
     */
    @NotBlank(message = "公司不能为空",groups = {ADD.class, EDIT.class})
    private String company;

    /**
     * 所属月份
     */
    @NotBlank(message = "所属月份不能为空",groups = {ADD.class, EDIT.class})
    private String month;

    /**
     * 税种
     */
    @NotBlank(message = "税种不能为空",groups = {ADD.class, EDIT.class})
    private String taxType;

    /**
     * 税率(%)
     */
    @NotNull(message = "税率(%)不能为空",groups = {ADD.class, EDIT.class})
    private Double rate;

    /**
     * 税金
     */
    @NotNull(message = "税金不能为空",groups = {ADD.class, EDIT.class})
    private Double tax;

    /**
     * 缴税状态
     */
    private PaymentStatus paymentStatus;

    /**
     * 付款日期
     */
    @NotBlank(message = "付款日期不能为空",groups = {EDIT.class})
    private String paymentDate;

    /**
     * 付款单位
     */
    @NotBlank(message = "付款单位不能为空",groups = {EDIT.class})
    private String paymentUnit;
    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentUnit() {
        return paymentUnit;
    }

    public void setPaymentUnit(String paymentUnit) {
        this.paymentUnit = paymentUnit;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }
}