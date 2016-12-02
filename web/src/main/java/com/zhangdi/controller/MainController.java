package com.zhangdi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hzzhandi3 on 2016/12/2.
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "demo";
    }

}
