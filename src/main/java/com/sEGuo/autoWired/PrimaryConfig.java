package com.sEGuo.autoWired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.sEGuo.autoWired")
public class PrimaryConfig {
    /*
    * 在加入@Primary注解之前，若容器内有两个相同的类，同时被另一个类依赖
    * @Autowired依赖引入的bean优先选择和依赖同名
    * @Qualifier也可以指定选择依赖哪个bean
    * */
    @Primary
    @Bean
    public PrimaryBean getPrimaryBean2(){
        return new PrimaryBean("other");
    }
}
