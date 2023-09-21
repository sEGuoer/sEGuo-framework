package D20230921;

import D20230921.Config.Configurations;
import com.sEGuo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnTest {
    @Test
    void singleton(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        Configurations configurations = (Configurations) context.getBean("Configuration1");
        configurations.testConfiguration1();
    }

    @Test
    void prototype(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        Configurations configurations = (Configurations) context.getBean("Configuration1");
        User user1 = configurations.testConfiguration2();
        User user2 = configurations.testConfiguration2();
    }
    @Test
    void LazyTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        Configurations configurations = (Configurations) context.getBean("Configuration1");
        User user1 = configurations.testConfiguration3();
        User user2 = configurations.testConfiguration3();
    }


}
