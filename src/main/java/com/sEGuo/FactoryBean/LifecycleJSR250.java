package com.sEGuo.FactoryBean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(value = "LifecycleJSR250")
public class LifecycleJSR250 {
    @Bean
    public LifecycleBeanJSR250 getJSR250Bean(){
        return new LifecycleBeanJSR250();
    }
}
