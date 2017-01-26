package com.zhangdi.demo;

/**
 * Created by hzzhandi3 on 2017/1/11.
 */
public class SecurityTest {

    public static void main(String[] args){

        System.setSecurityManager(new SecurityManager());
        System.out.println(System.getProperty("java.home"));
    }

}
