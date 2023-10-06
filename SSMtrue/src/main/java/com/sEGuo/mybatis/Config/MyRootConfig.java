package com.sEGuo.mybatis.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.sEGuo.mybatis.Dao","com.sEGuo.mybatis.Service"})
public class MyRootConfig {
}
