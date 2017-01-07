package com.zhangdi.demo;

/**
 * Created by hzzhandi3 on 2017/1/7.
 */
public interface InterfaceDemo {

    int add(int a, int b);

    default int sub(int a, int b) {
        return a - b;
    }
}
