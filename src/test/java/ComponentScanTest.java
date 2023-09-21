import com.sEGuo.Config.ScanConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {
    @Test
    void scanConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        Assertions.assertTrue(context.containsBean("scanConfig"));
        Assertions.assertTrue(context.containsBean("scanDao"));
        Assertions.assertTrue(context.containsBean("scanController"));
        Assertions.assertTrue(context.containsBean("scanSevice"));
        Assertions.assertFalse(context.containsBean("userController"));
    }
}
