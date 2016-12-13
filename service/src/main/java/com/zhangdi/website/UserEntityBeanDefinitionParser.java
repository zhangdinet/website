package com.zhangdi.website;

import com.zhangdi.website.entity.UserEntity;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * Created by hzzhandi3 on 2016/12/13.
 */
public class UserEntityBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return UserEntity.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder){
        
        String name = element.getAttribute("name");
        String nickName = element.getAttribute("nickName");
        String phone = element.getAttribute("phone");
        String email = element.getAttribute("email");

        builder.addPropertyValue("name",name);
        builder.addPropertyValue("nickName",nickName);
        builder.addPropertyValue("phone",phone);
        builder.addPropertyValue("email",email);

    }
}
