import com.sEGuo.FactoryBean.LifecycleJSR250;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FactoryBeanTest2 {
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
