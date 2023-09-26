
import com.sEGuo.autoWired.AutowiredPrimaryBean;
import com.sEGuo.autoWired.PrimaryBean;
import com.sEGuo.autoWired.PrimaryConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryBeanTest {
    @Test
    @DisplayName("@QualifierTest在通过@Autowired（其他几个@也可以）注入依赖是，指定拿到哪个bean")
    void primaryBean(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrimaryConfig.class);
        AutowiredPrimaryBean autowiredPrimaryBean = (AutowiredPrimaryBean) ac.getBean(AutowiredPrimaryBean.class);
        Assertions.assertEquals("other",autowiredPrimaryBean.getPrimaryBean().getBeanName());
    }
}
