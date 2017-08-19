package com.zhangdi.ali;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 子订单
 *
 * User: zhangdi
 * Date: 2017-01-14 16:11
 */
public class SubOrder implements Serializable {

    private static final long serialVersionUID = -8861242177516380240L;

    /**
     * 子单号
     */
    private Integer orderNo;

    /**
     * 关联订单号
     */
    private Integer relateOrderNo;

    /**
     * 子单类型
     */
    private OrderEnum orderType;

    /**
     * 子单描述
     */
    private String desc;

    /**
     * 子单总金额
     */
    private BigDecimal totalMoney;

    /**
     * 子单支付金额
     */
    private BigDecimal cash;

    /**
     * 子单红包金额
     */
    private BigDecimal redEnvelopMoney;

    /**
     * 子单积分金额
     */
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

    @Override
    public String toString() {
        return "SubOrder{" +
                "orderNo=" + orderNo +
                ", relateOrderNo=" + relateOrderNo +
                ", orderType=" + orderType +
                ", desc='" + desc + '\'' +
                ", totalMoney=" + totalMoney +
                ", cash=" + cash +
                ", redEnvelopMoney=" + redEnvelopMoney +
                ", pointMoney=" + pointMoney +
                '}';
    }
}
