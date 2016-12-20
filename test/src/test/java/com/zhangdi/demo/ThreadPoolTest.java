package com.zhangdi.demo;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by hzzhandi3 on 2016/12/19.
 */
public class ThreadPoolTest {

    public static void main(String[] args) {
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        Thread thread = threadFactory.newThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Just a demo");
            }
        });
        thread.start();
        int a = 10;
    }

}
