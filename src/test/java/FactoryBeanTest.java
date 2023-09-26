import com.sEGuo.FactoryBean.CustomBean;
import com.sEGuo.FactoryBean.CustomFactoryBean;
import com.sEGuo.FactoryBean.FactoryBeanConfig;
import com.sEGuo.FactoryBean.LifecycleJSR250;
import com.sEGuo.atValue.ValueBean;
import com.sEGuo.atValue.ValueBeanConfig;
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


}
