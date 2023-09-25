package com.sEGuo.FactoryBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration(value = "FactoryBeanConfig")
public class FactoryBeanConfig {
    @Bean(initMethod = "init",destroyMethod = "destory")
    public CustomFactoryBean getCustomFactoryBean(){
        return new CustomFactoryBean();
    }
}
