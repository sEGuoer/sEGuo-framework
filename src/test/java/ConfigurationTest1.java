import com.sEGuo.Config.Configuration1;
import com.sEGuo.pojo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationTest1 {
    @Test
    void configurationTestOne() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Configuration1.class);
        Assertions.assertTrue(ac.containsBean("testConfiguration"));
    }
    @Test
    void configurationTestTwo() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Configuration1.class);
        Assertions.assertTrue(ac.containsBean("Configuration1"));
        Assertions.assertTrue(ac.containsBean("ConfigurationTest1"));
    }
}
