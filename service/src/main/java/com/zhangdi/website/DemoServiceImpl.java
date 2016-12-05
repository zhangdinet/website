package com.zhangdi.website;

import org.springframework.stereotype.Service;

/**
 * Created by hzzhandi3 on 2016/12/5.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    public int add(int a, int b) {
        return a + b;
    }
}
