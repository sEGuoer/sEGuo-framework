import com.sEGuo.Config.Configuration1;
import com.sEGuo.Config.Configuration2;
import com.sEGuo.pojo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationTest1 {
    @Test
    void configurationTestOne() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Configuration1.class);
        Assertions.assertTrue(ac.containsBean("ConfigurationTest1"));
    }
    @Test
    void configurationTestTwo() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Configuration1.class);
        Assertions.assertTrue(ac.containsBean("Configuration1"));
        Assertions.assertTrue(ac.containsBean("ConfigurationTest1"));
    }
    @Test
    void configurationTestThree(){
        ApplicationContext ac=new AnnotationConfigApplicationContext(Configuration1.class);
        Configuration1 configuration1 =(Configuration1) ac.getBean("Configuration1");
        User user1 = configuration1.testConfiguration();
        User user2 = configuration1.testConfiguration();
        Assertions.assertSame(user2,user1);
    }
    @Test
    void configurationTestFour(){
        ApplicationContext ac=new AnnotationConfigApplicationContext(Configuration2.class);
        Configuration2 configuration2 =(Configuration2) ac.getBean("Configuration2");
        User user1 = configuration2.testConfiguration();
        User user2 = configuration2.testConfiguration();
        //Assertions.assertSame(user2,user1);
        //        因为不是返回同一个user，所以会报错

    }
}
