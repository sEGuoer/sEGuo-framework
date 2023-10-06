package com.sEGuo.mybatis.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({DataSourceConfig.class, MybatisConfig.class})
@PropertySource({"classpath:application.properties"})
public class AppConfig {
}
