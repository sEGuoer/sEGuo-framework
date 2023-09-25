import com.sEGuo.profile.ProfileConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileConfigTest2 {
    @BeforeAll
    static void before() {
        System.setProperty("spring.profiles.active", "dev");
    }

    @Test
    @DisplayName("在dev情况下")
    void ProfileConfig() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ProfileConfig.class);
        Assertions.assertTrue(ac.containsBean("getBeanOne"));
        Assertions.assertFalse(ac.containsBean("getBeanTwo"));
        Assertions.assertFalse(ac.containsBean("getBeanThree"));
    }
}
