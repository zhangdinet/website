package com.zhangdi.ali;


import com.beust.jcommander.internal.Lists;
import org.apache.commons.collections.MapUtils;
import org.testng.collections.Maps;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * User: zhangdi
 * Date: 2017-01-14 16:34
 */
public class Main {

    static Order order;

    public static void main(String[] args){

        order = initOrder();

        List<Integer> orderNoList = Arrays.asList(100211,100212,100213,100214);
        for(Integer orderNo:orderNoList){
            List<SubOrder> subOrderList = refund(orderNo);
            int a=10;
        }
    }

    public static Order initOrder(){
        Order order = new Order();
        order.setOrderNo(100210);
        order.setTotalMoney(BigDecimal.valueOf(1000));
        order.setCash(BigDecimal.valueOf(700));
        order.setRedEnvelopMoney(BigDecimal.valueOf(200));
        order.setPointMoney(BigDecimal.valueOf(100));
        order.setRemainCash(order.getCash());
        order.setSubOrderMap(Maps.<Integer, SubOrder>newHashMap());

        SubOrder subOrder = new SubOrder();
        subOrder.setOrderNo(100211);
        subOrder.setOrderType(OrderEnum.GOODS);
        subOrder.setDesc("海尔洗衣机*1");
        subOrder.setTotalMoney(BigDecimal.valueOf(500));
        order.getSubOrderMap().put(subOrder.getOrderNo(),subOrder);

        subOrder = new SubOrder();
        subOrder.setOrderNo(100212);
        subOrder.setOrderType(OrderEnum.GOODS);
        subOrder.setDesc("海信电视*1");
        subOrder.setTotalMoney(BigDecimal.valueOf(400));
        order.getSubOrderMap().put(subOrder.getOrderNo(),subOrder);

        subOrder = new SubOrder();
        subOrder.setOrderNo(100213);
        subOrder.setOrderType(OrderEnum.SERVICE);
        subOrder.setDesc("洗衣机调试费");
        subOrder.setTotalMoney(BigDecimal.valueOf(30));
        subOrder.setRelateOrderNo(100211);
        order.getSubOrderMap().put(subOrder.getOrderNo(),subOrder);

        subOrder = new SubOrder();
        subOrder.setOrderNo(100214);
        subOrder.setTotalMoney(BigDecimal.valueOf(70));
        subOrder.setOrderType(OrderEnum.SHIPMENT);
        subOrder.setRelateOrderNo(100210);
        order.getSubOrderMap().put(subOrder.getOrderNo(),subOrder);
        return order;
    }

    public static List<SubOrder> refund(int orderNo){
        List<SubOrder> orderList = Lists.newArrayList();
        if(MapUtils.isEmpty(order.getSubOrderMap())){
            return orderList;
        }
        SubOrder subOrder = order.getSubOrderMap().get(orderNo);
        if(subOrder.getOrderType()==OrderEnum.GOODS){
            SubOrder refundOrder = new SubOrder();
            BigDecimal pointMoney = subOrder.getTotalMoney().divide(order.getTotalMoney()).multiply(order.getPointMoney());
            BigDecimal remainMoney = subOrder.getTotalMoney().subtract(pointMoney);

            refundOrder.setTotalMoney(subOrder.getTotalMoney());
            refundOrder.setOrderNo(subOrder.getOrderNo());
            refundOrder.setPointMoney(pointMoney);
            if(order.getRemainCash().compareTo(remainMoney)>=0){
                refundOrder.setCash(remainMoney);
                order.setRemainCash(order.getRemainCash().subtract(refundOrder.getCash()));
            }else{
                refundOrder.setCash(order.getRemainCash());
                refundOrder.setRedEnvelopMoney(subOrder.getTotalMoney().subtract(refundOrder.getPointMoney()).subtract(refundOrder.getCash()));
                order.setRemainCash(BigDecimal.ZERO);
            }
            orderList.add(refundOrder);
            order.getSubOrderMap().remove(subOrder.getOrderNo());

            for(Map.Entry<Integer,SubOrder> entry:order.getSubOrderMap().entrySet()){
                subOrder = entry.getValue();
                if(subOrder.getRelateOrderNo()!=null
                        && subOrder.getRelateOrderNo().equals(refundOrder.getOrderNo())
                        && subOrder.getOrderType()==OrderEnum.SERVICE){

                    refundOrder = new SubOrder();
                    refundOrder.setTotalMoney(subOrder.getTotalMoney());
                    refundOrder.setOrderNo(subOrder.getOrderNo());
                    pointMoney = subOrder.getTotalMoney().divide(order.getTotalMoney()).multiply(order.getPointMoney());
                    remainMoney = subOrder.getTotalMoney().subtract(pointMoney);

                    refundOrder.setOrderNo(subOrder.getOrderNo());
                    refundOrder.setPointMoney(pointMoney);
                    if(order.getRemainCash().compareTo(remainMoney)>=0){
                        refundOrder.setCash(remainMoney);
                        order.setRemainCash(order.getRemainCash().subtract(refundOrder.getCash()));
                    }else{
                        refundOrder.setCash(order.getRemainCash());
                        refundOrder.setRedEnvelopMoney(subOrder.getTotalMoney().subtract(refundOrder.getPointMoney()).subtract(refundOrder.getCash()));
                        order.setRemainCash(BigDecimal.ZERO);
                    }
                    orderList.add(refundOrder);
                    order.getSubOrderMap().remove(refundOrder.getOrderNo());
                    break;
                }
            }

            if(order.getSubOrderMap().size()==1){
                subOrder = (SubOrder) order.getSubOrderMap().values().toArray()[0];
                if(subOrder.getOrderType()==OrderEnum.SHIPMENT){
                    refundOrder = new SubOrder();
                    refundOrder.setTotalMoney(subOrder.getTotalMoney());
                    refundOrder.setOrderNo(subOrder.getOrderNo());
                    pointMoney = subOrder.getTotalMoney().divide(order.getTotalMoney()).multiply(order.getPointMoney());
                    remainMoney = subOrder.getTotalMoney().subtract(pointMoney);
                    refundOrder.setPointMoney(pointMoney);
                    if(order.getRemainCash().compareTo(remainMoney)>=0){
                        refundOrder.setCash(remainMoney);
                        order.setRemainCash(order.getRemainCash().subtract(refundOrder.getCash()));
                    }else{
                        refundOrder.setCash(order.getRemainCash());
                        refundOrder.setRedEnvelopMoney(subOrder.getTotalMoney().subtract(refundOrder.getPointMoney()).subtract(refundOrder.getCash()));
                        order.setRemainCash(BigDecimal.ZERO);
                    }
                    orderList.add(refundOrder);
                    order.getSubOrderMap().remove(subOrder.getOrderNo());
                }
            }
        }
        return orderList;
    }
}
