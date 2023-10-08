package com.seguo.mybatis.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.seguo.mybatis.controller")
@EnableWebMvc
public class MyWebConfig {
}
