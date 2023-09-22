package D20230922;


import D20230921.Config.Configurations;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;


public class ConditionalTest12 {
    @Test
    void Conditional1Test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalClass.class);
        ConditionalClass conditional = (ConditionalClass) context.getBean("Conditional1");

    }
    @Test
    void Conditional2Test(){
        System.setProperty("os.name","MacOS");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalClass2.class);
        ConditionalClass2 conditional = (ConditionalClass2) context.getBean("Conditional2");
    }
}
