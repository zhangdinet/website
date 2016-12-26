package com.zhangdi.demo;

/**
 * Created by hzzhandi3 on 2016/12/26.
 */
public class HsdbTest{
    static Test t1 = new Test("java", 1);
    private Test t2 = new Test("java", 2);

    public void fn() {
        Test t3 = new Test("java", 3);
    }

    public static void main(String[] args) {
        new HsdbTest().fn();
    }
}

class Test {

    static String version = "1-1-1";

    String name;
    int id;

    Test(String name, int id) {
        this.name = name;
        this.id = id;
    }
    static void fn() {}
    void fn2(){}
}
