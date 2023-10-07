package com.sEGuo.mybatis.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.sEGuo.mybatis.Service","com.sEGuo.mybatis.Dao"})
@Import({AppConfig.class})
public class MyRootConfig {
}
