package com.zhangdi.website.controller;

//import com.google.common.collect .Maps;
import com.zhangdi.website.entity.UserEntity;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by hzzhandi3 on 2016/12/11.
 */
@Controller
@RequestMapping("/test")
public class TestController implements EnvironmentAware {

    Environment environment;

    @RequestMapping("/testJson")
    @ResponseBody
    public Map<String,UserEntity> testJson(){
        int a =  0;
        /*Map<String,UserEntity> map = Maps.newHashMap();

        UserEntity userEntity = new UserEntity();
        userEntity.setName("zhangdi");
        userEntity.setNickName("zhangdinet");
        userEntity.setEmail("zhangdinet@gmail.com");
        userEntity.setPhone("13636312766");
        map.put(userEntity.getName(),userEntity);

        userEntity = new UserEntity();
        userEntity.setName("ddd");
        userEntity.setNickName("zhanfffgdinet");
        userEntity.setEmail("zhanfdfdfgdinet@gmail.com");
        userEntity.setPhone("13636111312766");
        map.put(userEntity.getName(),userEntity);

        return map;*/
        return null;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
