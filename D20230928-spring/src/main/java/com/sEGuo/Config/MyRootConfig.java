package com.sEGuo.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.sEGuo.Dao","com.sEGuo.Service"})
public class MyRootConfig {
}
