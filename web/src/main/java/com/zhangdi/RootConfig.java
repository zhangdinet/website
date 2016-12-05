package com.zhangdi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by hzzhandi3 on 2016/12/5.
 */
@Configuration
@ComponentScan(basePackages = {"com.zhangdi"},excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)
    }
)
public class RootConfig {
}

