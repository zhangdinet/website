package com.zhangdi.demo.jmx;

import com.sun.jdmk.comm.HtmlAdaptorServer;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.swing.*;
import java.lang.management.ManagementFactory;

/**
 * Created by hzzhandi3 on 2016/12/20.
 */
public class JmxDemo {

    public static void main(String[] args){
        /*ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
        for(ThreadInfo threadInfo:threadInfos){
            System.out.println("[" + threadInfo.getThreadId()+"]" + threadInfo);
        }*/

        try {
            DemoMonitor demoMBean = new DemoMonitor();
            //MBeanServer mBeanServer = MBeanServerFactory.createMBeanServer();
            MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
            ObjectName objectName = new ObjectName("demo:id=DemoMonitor,port=5678");
            HtmlAdaptorServer adapter = new HtmlAdaptorServer();
            adapter.setPort(5678);
            mBeanServer.registerMBean(adapter,objectName);
            adapter.start();
           // System.out.println(mBeanServer.getAttribute(objectName,"Name"));

            JDialog dialog = new JDialog();
            dialog.setName("Jmx test");
            dialog.setVisible(true);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
