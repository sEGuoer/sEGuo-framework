package D20230922;

import com.sEGuo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration(value = "Conditional2")
public class ConditionalClass2 {
    @Bean(name = "Conditional1Test2")
    @Conditional({MacCondition.class})
    public User testConfiguration1(){
        System.out.println("ConditionalClass.testConfiguration2");
        return new User("123","123");
    }
}
