package D20230921.Config;
import com.sEGuo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration(value = "Configuration1")
public class Configurations {
    @Bean(name = "ConfigurationTest1")
    public User testConfiguration1(){
        System.out.println("Configurations.testConfiguration1");
        return new User("123","123");
    }
    @Bean(name = "ConfigurationTest2")
    @Scope("prototype")
    public User testConfiguration2(){
        System.out.println("Configurations.testConfiguration2");
        return new User("123","123");
    }
    @Bean(name = "ConfigurationTest3")
    @Lazy
    public User testConfiguration3(){
        System.out.println("Configurations.testConfiguration3");
        return new User("123","123");
    }
}
