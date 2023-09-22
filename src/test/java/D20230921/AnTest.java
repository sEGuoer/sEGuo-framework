package D20230921;

import D20230921.Config.Configurations;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.sEGuo.pojo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;

public class AnTest {
    static final ByteArrayOutputStream out = new ByteArrayOutputStream();
    @BeforeAll
    static void beforeAll(){
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);
    }
    @Test
    void singleton(){
        Assertions.assertEquals("",out.toString());
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        Configurations configurations = (Configurations) context.getBean("Configuration1");
        Assertions.assertNotNull(configurations.testConfiguration1());
        Assertions.assertEquals("Configurations.testConfiguration1"+System.getProperty("line.separator"),out.toString());
//        System.getProperty("line.separator") = System.lineSeparator()
    }

    @Test
    void prototype(){
        Assertions.assertEquals("",out.toString());
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        Configurations configurations = (Configurations) context.getBean("Configuration1");
        Assertions.assertEquals("Configurations.testConfiguration1"+System.getProperty("line.separator"),out.toString());

//        Assertions.assertSame(configurations.testConfiguration2(),configurations.testConfiguration2());
    }
    @Test
    @DisplayName("要测试方法是否被调用时容器初始化时就调用，用其他两个test测试")
    void LazyTest(){

        Assertions.assertEquals("",out.toString());
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        Configurations configurations = (Configurations) context.getBean("Configuration1");
        Assertions.assertEquals("Configurations.testConfiguration1"+System.getProperty("line.separator"),out.toString());
        Assertions.assertSame(configurations.testConfiguration3(),configurations.testConfiguration3());
        Assertions.assertEquals("Configurations.testConfiguration1"+System.getProperty("line.separator")+"Configurations.testConfiguration3"+System.getProperty("line.separator"),out.toString());
    }


}
