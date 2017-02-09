package com.zhangdi.demo;

import java.util.Random;

/**
 * User: hzzhandi3
 * Date: 2017-02-09 19:58
 */
public class RandomTest {
    public static void main(String[] args){
        Random random = new Random();
        random.nextInt();
        random.nextInt(100);
        random.nextInt(1000);
    }
}
