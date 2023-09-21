package D20230921;

import D20230921.Config.Configurations;
import com.sEGuo.pojo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnTest {
    @Test
    void singleton(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        Configurations configurations = (Configurations) context.getBean("Configuration1");
        Assertions.assertNotNull(configurations.testConfiguration1());
    }

    @Test
    void prototype(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        Configurations configurations = (Configurations) context.getBean("Configuration1");
//        Assertions.assertSame(configurations.testConfiguration2(),configurations.testConfiguration2());
    }
    @Test
    @DisplayName("要测试方法是否被调用时容器初始化时就调用，用其他两个test测试")
    void LazyTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        Configurations configurations = (Configurations) context.getBean("Configuration1");
        Assertions.assertSame(configurations.testConfiguration3(),configurations.testConfiguration3());
    }


}
