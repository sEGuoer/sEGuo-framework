import com.sEGuo.aware.AwareConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AwareConfigTest {
    static final ByteArrayOutputStream out = new ByteArrayOutputStream();
    @BeforeAll
    static void before(){
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);
    }

    @Test
    void AwareConfig(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AwareConfig.class);
        Assertions.assertTrue(ac.containsBean("com.sEGuo.aware.AwareBean"));
        Assertions.assertEquals("com.sEGuo.aware.AwareBean"+System.getProperty("line.separator")+"AwareBean.setEmbeddedValueResolver"+System.getProperty("line.separator")+"AwareBean.setApplicationContext"+System.getProperty("line.separator"),out.toString());
    }
}
