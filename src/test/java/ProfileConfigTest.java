import com.sEGuo.profile.ProfileConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ProfileConfigTest {
    @BeforeAll
    static void before(){
       System.setProperty("spring.profiles.active","test");
    }

    @Test
    @DisplayName("在test情况下")
    void ProfileConfig(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ProfileConfig.class);
        Assertions.assertTrue(ac.containsBean("getBeanOne"));
        Assertions.assertTrue(ac.containsBean("getBeanTwo"));
        Assertions.assertFalse(ac.containsBean("getBeanThree"));
    }
}
