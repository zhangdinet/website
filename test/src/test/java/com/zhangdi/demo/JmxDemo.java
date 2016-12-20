package com.zhangdi.demo;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * Created by hzzhandi3 on 2016/12/20.
 */
public class JmxDemo {

    public static void main(String[] args){
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
        for(ThreadInfo threadInfo:threadInfos){
            System.out.println("[" + threadInfo.getThreadId()+"]" + threadInfo);
        }
    }
}
