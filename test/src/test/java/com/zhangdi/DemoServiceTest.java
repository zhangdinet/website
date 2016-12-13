package com.zhangdi;

import com.zhangdi.website.service.DemoService;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Created by hzzhandi3 on 2016/12/13.
 */
public class DemoServiceTest extends BaseTest {

    @Resource
    DemoService demoService;

    @Test
    public void testDemo(){
        int c = demoService.add(3,4);
        Assert.assertEquals(c,7);
    }
}
