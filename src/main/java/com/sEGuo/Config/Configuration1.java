package com.sEGuo.Config;

import com.sEGuo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(value = "Configuration1")
public class Configuration1 {
    @Bean(name = "ConfigurationTest1")
    public User testConfiguration(){
        return new User("123","123");
    }
}
