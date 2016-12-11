package com.zhangdi.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hzzhandi3 on 2016/12/2.
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/main")
    @ResponseBody
    public String main() {
        //DemoEnum d = DemoEnum.THREE;
        //DemoEnum dd = DemoEnum.TWO;

        System.out.println(this.getClass().getResource("/img"));
        System.out.print(this.getClass().getResource("img"));


        int a = 10;
        return null;
    }
}
