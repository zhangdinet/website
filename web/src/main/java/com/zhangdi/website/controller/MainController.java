package com.zhangdi.website.controller;

import com.zhangdi.website.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by hzzhandi3 on 2016/12/2.
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @Resource(name = "dService")
    DemoService demoService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        int c = 10/0;
        return "demo";
    }

    @RequestMapping("/home")
    public String home(ModelMap modelMap){
        int l = demoService.add(10,15);

        modelMap.put("age",20);
        return "demo";
    }

}
