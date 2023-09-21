package com.sEGuo.druid.Config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.sEGuo.druid.method.DruidDemo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

@Configuration(value = "DruidConfig")
public class DruidConfig {

    private static DataSource dataSource;

    @Bean
    public DataSource dataSource() {
        Properties properties = new Properties();
        Connection connection = null;
        try (InputStream inputStream = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties")) {
            properties.load(inputStream);
            dataSource = DruidDataSourceFactory.createDataSource(properties);
            connection = dataSource.getConnection();
            System.out.println(dataSource);
            return dataSource;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
