package com.zhangdi;

import com.zhangdi.website.service.SpiDemoService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ServiceLoader;

/**
 * Created by hzzhandi3 on 2016/12/13.
 */

public class SpiDemoServiceTest extends BaseTest {

    @Test
    public void testHello(){

        ServiceLoader<SpiDemoService> loaders = ServiceLoader.load(SpiDemoService.class);
        for(SpiDemoService spiDemoService: loaders){
            String result = spiDemoService.hello("zhangdi");
            logger.debug(result);
            Assert.assertEquals("hello zhangdi",result);
        }
    }
}
