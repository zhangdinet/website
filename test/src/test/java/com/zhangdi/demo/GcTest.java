package com.zhangdi.demo;

/**
 * Created by hzzhandi3 on 2016/12/15.
 */
public class GcTest {

    private static final int HEAP_SIZE = 1024 * 1024;

    // vm :-verbose:gc -Xmx20M -Xms20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8

    public static void main(String[] args) {
        byte[] a1, a2, a3, a4;

        a1 = new byte[8 * HEAP_SIZE];
        System.gc();
    }
}
