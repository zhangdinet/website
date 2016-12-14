package com.zhangdi.website.service;

import com.zhangdi.BaseTest;
import com.zhangdi.website.entity.UserEntity;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Created by hzzhandi3 on 2016/12/13.
 */
public class DemoNamespaceHandlerTest extends BaseTest {

   @Resource
   UserEntity userEntity;

   @Test
   public void test() {
      logger.debug(userEntity.toString());
      int a=10;
   }
}
