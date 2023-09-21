import com.sEGuo.Config.Configuration1;
import com.sEGuo.pojo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationTest1 {
    @Test
    void ConfigurationTestOne() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Configuration1.class);
        Assertions.assertTrue(ac.containsBean("testConfiguration"));
    }
}
