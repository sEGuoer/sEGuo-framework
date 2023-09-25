
import com.sEGuo.autoWired.AutowiredPrimaryBean;
import com.sEGuo.autoWired.PrimaryBean;
import com.sEGuo.autoWired.PrimaryConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryBeanTest {
    @Test
    void primaryBean(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrimaryConfig.class);
        AutowiredPrimaryBean autowiredPrimaryBean = (AutowiredPrimaryBean) ac.getBean(AutowiredPrimaryBean.class);
        Assertions.assertEquals("other",autowiredPrimaryBean.getPrimaryBean().getBeanName());
    }
}
