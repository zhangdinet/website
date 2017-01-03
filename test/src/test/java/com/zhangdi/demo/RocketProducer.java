package com.zhangdi.demo;

import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;

/**
 * Created by hzzhandi3 on 2017/1/3.
 */
public class RocketProducer {
    public static void main(String[] args) {
        try {
            DefaultMQProducer producer = new DefaultMQProducer("DemoGroupName");
            producer.setNamesrvAddr("127.0.0.1:9876");
            producer.setInstanceName("Producer");
            producer.start();

            for (int i = 0; i < 100000; i++) {
                Message msg = new Message("Topic1", "Tag1", "order_" + i, ("hello " + i).getBytes());
                SendResult sendResult = producer.send(msg);
                System.out.println(sendResult);
            }

            for (int i = 0; i < 100000; i++) {
                Message msg = new Message("Topic1", "Tag2", "stockout_" + i, ("stockout " + i).getBytes());
                SendResult sendResult = producer.send(msg);
                System.out.println(sendResult);
            }

            for (int i = 0; i < 100000; i++) {
                Message msg = new Message("Topic2", "Tag", "sku" + i, ("sku " + i).getBytes());
                SendResult sendResult = producer.send(msg);
                System.out.println(sendResult);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
