package com.zhangdi.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: hzzhandi3
 * Date: 2017-01-17 19:40
 */
public class PatternTest {

    public static String str = "136-3631-2766:zhangdinet@gmail.com";

    public static void main(String[] args){

        Pattern pattern = Pattern.compile("(\\W+)(\\w+)");
        Matcher matcher = pattern.matcher(str);
        int a=10;


    }
}
