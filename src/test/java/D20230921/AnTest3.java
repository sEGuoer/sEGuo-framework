package D20230921;

import D20230921.Config.Configurations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AnTest3 {
    static final ByteArrayOutputStream out = new ByteArrayOutputStream();
    @BeforeAll
    static void beforeAll(){
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);
    }

    @Test
    void prototype(){
        Assertions.assertEquals("",out.toString());
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        Configurations configurations = (Configurations) context.getBean("Configuration1");
        Assertions.assertEquals("Configurations.testConfiguration1"+System.getProperty("line.separator"),out.toString());

//        Assertions.assertSame(configurations.testConfiguration2(),configurations.testConfiguration2());
    }
}
