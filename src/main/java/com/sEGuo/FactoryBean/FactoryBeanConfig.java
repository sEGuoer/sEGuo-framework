package com.sEGuo.FactoryBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration(value = "FactoryBeanConfig")
@ComponentScan("com.sEGuo.FactoryBean")
public class FactoryBeanConfig {
    @Bean(initMethod = "init",destroyMethod = "destory")
    public CustomFactoryBean getCustomFactoryBean(){
        return new CustomFactoryBean();
    }
}
