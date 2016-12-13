package com.zhangdi.website;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by hzzhandi3 on 2016/12/13.
 */
public class DemoNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init(){
        registerBeanDefinitionParser("userEntity",new UserEntityBeanDefinitionParser());
    }
}
