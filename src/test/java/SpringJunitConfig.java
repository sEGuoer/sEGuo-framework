import com.sEGuo.Config.Configuration1;
import com.sEGuo.pojo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(Configuration1.class)
public class SpringJunitConfig {
    @Autowired
    ApplicationContext ac;
    @Test
    void configurationTest(){
        Configuration1 configuration1 =(Configuration1) ac.getBean("Configuration1");
        User user1 = configuration1.testConfiguration();
        User user2 = configuration1.testConfiguration();
        Assertions.assertSame(user2,user1);
    }
}
