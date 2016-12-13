package com.zhangdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * Created by hzzhandi3 on 2016/12/13.
 */

@Test
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BaseTest extends AbstractTestNGSpringContextTests {

    protected static Logger logger  = LoggerFactory.getLogger(BaseTest.class);

}
