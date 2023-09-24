
import com.sEGuo.atImportResource.BeanDemo;
import com.sEGuo.atImportResource.ImportResourceConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ImportResourceConfigTest {
    @Test
    void ImportResourceTest(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ImportResourceConfig.class);
        BeanDemo beanDemo = (BeanDemo)ac.getBean("importResourceBeanDemo") ;
        Assertions.assertEquals("BeanDemo.getBeanDemo",beanDemo.getBeanDemo());
    }
}
