package com.zhangdi.controller;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.testng.annotations.Test;

/**
 * Created by hzzhandi3 on 2016/12/5.
 */
public class MainControllerTest {

    @Test
    public void testHome() throws Exception{
        MainController mainController = new MainController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(mainController).build();

        mockMvc.perform(MockMvcRequestBuilders.get("/main/home"))
                .andExpect(MockMvcResultMatchers.view().name("demo"));
    }
}
