package com.sEGuo.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.sEGuo.Controller")
@EnableWebMvc
public class MyWebConfig {
}
