package com.sEGuo.autoWired.otherPosition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sEGuo.autoWired.otherPosition")
public class OtherPositionAutowiredConfig {
    @Bean
    public Plane getPlane(Boss boss){
        return new Plane(boss);
    }
}
