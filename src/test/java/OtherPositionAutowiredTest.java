
import com.sEGuo.autoWired.otherPosition.OtherPositionAutowiredConfig;
import com.sEGuo.autoWired.otherPosition.Plane;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OtherPositionAutowiredTest {
    @Test
    void ohterPositionAutowired(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(OtherPositionAutowiredConfig.class);
        Assertions.assertTrue(ac.containsBean("car"));
        Assertions.assertTrue(ac.containsBean("boss"));
        Assertions.assertTrue(ac.containsBean("assistant"));
        Plane p = (Plane)ac.getBean("getPlane");
        Assertions.assertNotNull(p.getBoss());

    }
}
