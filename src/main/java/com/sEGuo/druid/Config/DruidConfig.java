package com.sEGuo.druid.Config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.sEGuo.druid.method.DruidDemo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

@Configuration(value = "DruidConfig")
public class DruidConfig {

    private static DataSource dataSource;

    @Bean
    public DataSource dataSource() {
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("druid.xml");
        DruidDataSource dataSource = (DruidDataSource) ac.getBean("dataSource");
        return  dataSource;
    }

}
