
import com.sEGuo.autoWired.AutowiredPrimaryBean;
import com.sEGuo.autoWired.PrimaryBean;
import com.sEGuo.autoWired.PrimaryConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryBeanTest {
    @Test
    @DisplayName("@Primary在配置类 @Bean前加入指定拿到当前bean")
    void primaryBean(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrimaryConfig.class);
        AutowiredPrimaryBean autowiredPrimaryBean = (AutowiredPrimaryBean) ac.getBean(AutowiredPrimaryBean.class);
        Assertions.assertEquals("other",autowiredPrimaryBean.getPrimaryBean().getBeanName());
    }
}
