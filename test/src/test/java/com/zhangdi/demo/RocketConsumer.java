package com.zhangdi.demo;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.message.MessageExt;

import java.util.List;

/**
 * Created by hzzhandi3 on 2017/1/3.
 */
public class RocketConsumer {
    public static void main(String[] args){
        try {
            DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("DemoConsumerGroupName");
            consumer.setNamesrvAddr("127.0.0.1:9876");
            consumer.setInstanceName("Consumer");
            consumer.subscribe("Topic1","*");
            consumer.subscribe("Topic2","*");
            consumer.registerMessageListener(new MessageListenerConcurrently() {
                @Override
                public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
                    System.out.println(Thread.currentThread().getName() + " Receive New Messages: " + msgs.size());

                    MessageExt msg = msgs.get(0);
                    if (msg.getTopic().equals("Topic1")) {
                        //执行TopicTest1的消费逻辑
                        if (msg.getTags() != null && msg.getTags().equals("Tag1")) {
                            //执行TagA的消费
                            System.out.println(new String(msg.getBody()));
                        } else if (msg.getTags() != null
                                && msg.getTags().equals("Tag2")) {
                            //执行TagC的消费
                            System.out.println(new String(msg.getBody()));
                        }
                    } else if (msg.getTopic().equals("Topic2")) {
                        System.out.println(new String(msg.getBody()));
                    }
                    return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
                }
            });
            consumer.start();

        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
