
import com.sEGuo.autoWired.otherPosition.OtherPositionAutowiredConfig;
import com.sEGuo.autoWired.otherPosition.Plane;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OtherPositionAutowiredTest {
    @Test
    @DisplayName("不同地方的依赖引入，都可以拿到对应的依赖")
    void ohterPositionAutowired(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(OtherPositionAutowiredConfig.class);
        Assertions.assertTrue(ac.containsBean("car"));
        Assertions.assertTrue(ac.containsBean("boss"));
        Assertions.assertTrue(ac.containsBean("assistant"));
        Plane p = (Plane)ac.getBean("getPlane");
        Assertions.assertNotNull(p.getBoss());
        Assertions.assertNotNull(p.getCar());
        Assertions.assertNotNull(p.getAssistant());

    }
}
