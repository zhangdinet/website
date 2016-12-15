package com.zhangdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hzzhandi3 on 2016/12/15.
 */
public class MainTest {

    private static Logger logger = LoggerFactory.getLogger(MainTest.class);

    public static void main(String[] args){
        logger.debug("test,test"+Thread.currentThread().getName());
        int a=10;
        a++;
    }

}
