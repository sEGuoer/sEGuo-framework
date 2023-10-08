package com.seguo.mybatis.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.seguo.mybatis.service","com.seguo.mybatis.dao"})
@Import({AppConfig.class})
public class MyRootConfig {
}
