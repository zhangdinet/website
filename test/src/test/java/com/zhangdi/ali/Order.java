package com.zhangdi.ali;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

/**
 * User: zhangdi
 * Date: 2017-01-14 17:18
 */
public class Order implements Serializable {

    private static final long serialVersionUID = -8861242177516380240L;

    private Integer orderNo;

    private BigDecimal totalMoney;

    private BigDecimal cash;

    private BigDecimal redEnvelopMoney;

    private BigDecimal pointMoney;

    private BigDecimal remainCash;

    Map<Integer,SubOrder> subOrderMap;

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
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

    public BigDecimal getRemainCash() {
        return remainCash;
    }

    public void setRemainCash(BigDecimal remainCash) {
        this.remainCash = remainCash;
    }

    public Map<Integer, SubOrder> getSubOrderMap() {
        return subOrderMap;
    }

    public void setSubOrderMap(Map<Integer, SubOrder> subOrderMap) {
        this.subOrderMap = subOrderMap;
    }
}
