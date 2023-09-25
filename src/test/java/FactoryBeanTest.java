import com.sEGuo.FactoryBean.CustomBean;
import com.sEGuo.FactoryBean.CustomFactoryBean;
import com.sEGuo.FactoryBean.FactoryBeanConfig;
import com.sEGuo.FactoryBean.LifecycleJSR250;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FactoryBeanTest {
    @Test
    @DisplayName("用FactoryBean接口拿到工厂批量生产的bean")
    void FactoryBeanConfigTest() throws Exception {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        CustomBean customFactoryBean = (CustomBean)ac.getBean("customFactoryBean");
        Assertions.assertTrue(ac.containsBean("customFactoryBean"));
    }
    @Test
    @DisplayName("用FactoryBean接口拿到工厂批量生产的本身的bean")
    void FactoryBeanConfigTest1() throws Exception {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        CustomFactoryBean customFactoryBean = (CustomFactoryBean)ac.getBean("&customFactoryBean");
        Assertions.assertTrue(ac.containsBean("&customFactoryBean"));
    }
    static final ByteArrayOutputStream out = new ByteArrayOutputStream();
    @BeforeAll
    static void beforeAll(){
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);
    }
    @Test
    @DisplayName("用JSR250中的@PostConstruct来代替bean中的init和destroy方法")
    void FactoryBeanConfigTest2() throws Exception {
        Assertions.assertEquals("",out.toString());
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(LifecycleJSR250.class);
        LifecycleJSR250 lifecycleJSR250 = (LifecycleJSR250)ac.getBean("LifecycleJSR250");
        Assertions.assertEquals("CustomFactoryBean.init"+System.getProperty("line.separator")+"CustomFactoryBean.destory"+System.getProperty("line.separator"),out.toString());
    }
}
