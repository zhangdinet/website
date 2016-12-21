package com.zhangdi.demo;

import com.beust.jcommander.internal.Lists;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * Created by hzzhandi3 on 2016/12/21.
 */
public class WaitTest {

    public static List<Long> commonList = Lists.newArrayList();
    public static Object object = new Object();
    public static Object p = new Object();
    public static Object c = new Object();

    public static void main(String[] args) {

        Thread thread = new Thread(new Producer(commonList), "Producer Beijing");
        Thread thread2 = new Thread(new Producer(commonList), "Producer Shanghai");
        Thread thread3 = new Thread(new Consumer(commonList), "Consumer");

        thread.start();
        thread2.start();
        thread3.start();
        try{
            thread.join();
            thread2.join();
            thread3.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("======End======");
    }

    static class Producer implements Runnable {

        List<Long> list = null;
        static long index = 0;

        public Producer(List<Long> list) {
            this.list = list;
        }

        public void run() {
            while (true) {
                synchronized (object) {
                    try {
                        while (list.size() > 10) {
                            System.out.println(Thread.currentThread().getName() + "List is full");
                            object.wait();
                        }
                        list.add(index++);
                        object.notify();
                        System.out.println("producer" + Thread.currentThread().getName() + index +"==========");
                        Thread.sleep(2000L);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Consumer implements Runnable {

        List<Long> list = null;

        public Consumer(List<Long> list) {
            this.list = list;
        }

        public void run() {
            while (true) {
                synchronized (object) {
                    try {
                        while (CollectionUtils.isEmpty(list)) {
                            System.out.println(Thread.currentThread().getName() + "List is empty");
                            object.wait();
                        }
                        Long result = list.remove(0);
                        object.notifyAll();
                        System.out.println("consumer=======" + result);
                        Thread.sleep(2000L);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
