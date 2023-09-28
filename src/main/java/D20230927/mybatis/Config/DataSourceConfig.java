package D20230927.mybatis.Config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.lang.management.PlatformLoggingMXBean;

@Configuration
public class DataSourceConfig {
    @Value("${spring.datasource.driverclassname}")
    private String driver;
    @Value ("${spring.datasource.url}")
    private String url;
    @Value ("${spring.datasource.username}")
    private String username;


    @Bean
    DataSource getDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUsername(username);
        return druidDataSource;
    }

    @Bean
    PlatformTransactionManager transactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}

