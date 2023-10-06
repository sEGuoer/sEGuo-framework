package com.sEGuo.mybatis.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.sEGuo.mybatis.Controller")
@EnableWebMvc
public class MyWebConfig {
}
