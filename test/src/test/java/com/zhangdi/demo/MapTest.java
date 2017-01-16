package com.zhangdi.demo;

import org.testng.collections.Maps;

import java.util.Map;

/**
 * Created by hzzhandi3 on 2017/1/11.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer, Integer> map = Maps.newHashMap();
        map.put(0,0);
        map.put(1,10);
        map.put(2,20);
        map.put(3,null);
        map.put(null,3100);
        map.put(null,3200);
        map.get(null);

    }
}
