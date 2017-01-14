package com.zhangdi.ali;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * User: zhangdi
 * Date: 2017-01-14 16:11
 */
public class SubOrder implements Serializable {

    private static final long serialVersionUID = -8861242177516380240L;

    private Integer orderNo;

    private Integer relateOrderNo;

    private OrderEnum orderType;

    private String desc;

    private BigDecimal totalMoney;

    private BigDecimal cash;

    private BigDecimal redEnvelopMoney;

    private BigDecimal pointMoney;

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getRelateOrderNo() {
        return relateOrderNo;
    }

    public void setRelateOrderNo(Integer relateOrderNo) {
        this.relateOrderNo = relateOrderNo;
    }

    public OrderEnum getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderEnum orderType) {
        this.orderType = orderType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public BigDecimal getRedEnvelopMoney() {
        return redEnvelopMoney;
    }

    public void setRedEnvelopMoney(BigDecimal redEnvelopMoney) {
        this.redEnvelopMoney = redEnvelopMoney;
    }

    public BigDecimal getPointMoney() {
        return pointMoney;
    }

    public void setPointMoney(BigDecimal pointMoney) {
        this.pointMoney = pointMoney;
    }
}
