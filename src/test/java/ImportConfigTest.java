
import com.sEGuo.atImport.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportConfigTest {
    @Test
    void ImportConfig() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ImportConfig.class);
        Apple apple = (Apple) ac.getBean("com.sEGuo.atImport.Apple");
        Assertions.assertEquals("com.sEGuo.atImport.Apple", apple.getClass().getName());
        Assertions.assertEquals("Apple.getApple", apple.getApple());
        Banana banana = (Banana) ac.getBean("com.sEGuo.atImport.Banana");
        Assertions.assertEquals("com.sEGuo.atImport.Banana", banana.getClass().getName());
        Assertions.assertEquals("Banana.getBanana", banana.getBanana());
        Cat cat = (Cat) ac.getBean("com.sEGuo.atImport.Cat");
        Assertions.assertEquals("com.sEGuo.atImport.Cat", cat.getClass().getName());
        Assertions.assertEquals("Cat.getCat", cat.getCat());
        Dog dog = (Dog) ac.getBean("Dog");
        Assertions.assertEquals("com.sEGuo.atImport.Dog", dog.getClass().getName());
        Assertions.assertEquals("Dog.getDog", dog.getDog());
    }
}
