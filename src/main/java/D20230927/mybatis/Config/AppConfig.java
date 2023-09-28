package D20230927.mybatis.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:application.properties"})
@ComponentScan("D20230927.mybatis.Service")
@EnableAspectJAutoProxy
public class AppConfig {
}
