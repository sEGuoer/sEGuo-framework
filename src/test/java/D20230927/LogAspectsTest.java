package D20230927;

import D20230927.aop.AOP.MathCalculator;
import D20230927.aop.Config.LogAspectsConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LogAspectsTest {
    @Test
    void logAspectsTest(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(LogAspectsConfig.class);
        Assertions.assertThrows(java.lang.ArithmeticException.class,()->{
            ac.getBean(MathCalculator.class).getMath(3, 0);
        });
    }
    @Test
    @DisplayName("由于控制台会打印出日志，所以迫于无奈先把相关日志打印消息控制不打印，然后再去对比结果")
    void logAspectsTest2(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(LogAspectsConfig.class);
        String expected = "before:.*"
                + System.lineSeparator() + "AfterReturning:.*"
                + System.lineSeparator() + "After:.*"
                + System.lineSeparator();
//        System.out.println(expected);
        ac.getBean(MathCalculator.class).getMath(3, 1);
        Assertions.assertTrue(out.toString().matches(expected));
    }
}
