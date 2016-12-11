package com.zhangdi.website.controller;

import com.alibaba.fastjson.JSON;
import com.zhangdi.website.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hzzhandi3 on 2016/12/11.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/testJson")
    @ResponseBody
    public String testJson(){
        UserEntity userEntity = new UserEntity();
        userEntity.setName("zhangdi");
        userEntity.setNickName("zhangdinet");
        userEntity.setEmail("zhangdinet@gmail.com");
        userEntity.setPhone("13636312766");
        return JSON.toJSONString(userEntity);
    }
}
