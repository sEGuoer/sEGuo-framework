import com.sEGuo.listener.ApplicationListenerConfig;
import com.sEGuo.listener.MyEvent;
import com.sEGuo.listener.MyEventSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplicationListenerTest {
    @Test
    @DisplayName("监控各种事件，除了自己创建的事件外还有容器自己的。")
    void MyApplicationListener() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationListenerConfig.class);
        ac.publishEvent(new MyEvent(new MyEventSource()));
        ac.close();
    }
}
