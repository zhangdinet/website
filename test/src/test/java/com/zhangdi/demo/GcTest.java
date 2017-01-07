package com.zhangdi.demo;

/**
 * Created by hzzhandi3 on 2016/12/15.
 */
public class GcTest {

    private static final int HEAP_SIZE = 1024 * 1024;

    // vm :-verbose:gc -Xmx30M -Xms30M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8

    public static void main(String[] args) {
        Memory.test();
        //System.gc();
        int b = 10;
    }


    static class Memory {
        public static void test() {
            byte[] a1, a2, a3, a4;
            int a = 10;
            a1 = new byte[8 * HEAP_SIZE];
            a++;
            a2 = new byte[6 * HEAP_SIZE];
            a++;
            a3 = new byte[20 * HEAP_SIZE];
            a++;
            a4 = new byte[HEAP_SIZE];
        }
    }
}
