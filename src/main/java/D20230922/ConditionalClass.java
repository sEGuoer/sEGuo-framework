package D20230922;


import com.sEGuo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration(value = "Conditional1")
public class ConditionalClass {
    @Bean(name = "Conditional1Test1")
    @Conditional({WindowsCondition.class})
    public User testConfiguration1(){
        System.out.println("ConditionalClass.testConfiguration1");
        return new User("123","123");
    }
}
