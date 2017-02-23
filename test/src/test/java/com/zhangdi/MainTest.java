package com.zhangdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzzhandi3 on 2016/12/15.
 */
public class MainTest {

    private static Logger logger = LoggerFactory.getLogger(MainTest.class);

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        for(Integer l : list){
            System.out.print(l);
        }
        System.out.print("end");

    }

}


