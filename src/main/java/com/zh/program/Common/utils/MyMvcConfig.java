package com.zh.program.Common.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @description:
 * @author: zhaohe
 * @create: 2019-05-15 17:15
 */
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
