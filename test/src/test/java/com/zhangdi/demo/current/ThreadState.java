package com.zhangdi.demo.current;

import javax.servlet.Servlet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 6-3
 */
public class ThreadState {

    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        new Thread(new TimeWaiting(), "TimeWaitingThread").start();
        new Thread(new Waiting(), "WaitingThread").start();
        new Thread(new Blocked(), "BlockedThread-1").start();
        new Thread(new Blocked(), "BlockedThread-2").start();
        new Thread(new Sync(), "SyncThread-1").start();
        new Thread(new Sync(), "SyncThread-2").start();
    }

    /**
     * ���̲߳��ϵĽ���˯��
     */
    static class TimeWaiting implements Runnable {
        @Override
        public void run() {
            SleepUtils.second(20);
            while (true) {

            }
        }
    }

    /**
     * ���߳���Waiting.classʵ���ϵȴ�
     */
    static class Waiting implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (Servlet.class) {
                    try {
                        Servlet.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * ���߳���Blocked.classʵ���ϼ����󣬲����ͷŸ���
     */
    static class Blocked implements Runnable {
        public void run() {
            synchronized (Blocked.class) {
                while (true) {
                    SleepUtils.second(100);
                }
            }
        }
    }

    static class Sync implements Runnable {
        @Override
        public void run() {
            lock.lock();
            try {
                SleepUtils.second(100);
            } finally {
                lock.unlock();
            }
        }
    }
}