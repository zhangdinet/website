package com.zhangdi.demo.jmx;

/**
 * User: hzzhandi3
 * Date: 2017-01-18 20:51
 */
public class DemoMonitor implements DemoMonitorMBean {

    private String name = "hello";

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
