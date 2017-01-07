package com.zhangdi.demo;

/**
 * Created by hzzhandi3 on 2017/1/7.
 */
public class InterfaceDemoImpl implements InterfaceDemo {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args){
        InterfaceDemoImpl interfaceDemo = new InterfaceDemoImpl();
        int r = interfaceDemo.sub(5,3);
        System.out.println(r);
    }
}
