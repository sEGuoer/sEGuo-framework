package com.sEGuo.Config;

import com.sEGuo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration()
public class Configuration1 {
    @Bean()
    public User testConfiguration(){
        return new User("123","123");
    }
}
