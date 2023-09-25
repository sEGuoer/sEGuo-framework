import com.sEGuo.FactoryBean.FactoryBeanConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanTest {
    @Test
    void FactoryBeanConfigTest() throws Exception {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        FactoryBeanConfig factoryBeanConfig = (FactoryBeanConfig)ac.getBean("FactoryBeanConfig");
        Assertions.assertEquals("class com.sEGuo.FactoryBean.CustomBean",factoryBeanConfig.getCustomFactoryBean().getObjectType().toString());
    }
}
