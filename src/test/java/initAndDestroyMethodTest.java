import com.sEGuo.sevice.UserSevice;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class initAndDestroyMethodTest {
    static ClassPathXmlApplicationContext ac;
    @BeforeAll
    static void BeforeAllTest(){
        ac = new ClassPathXmlApplicationContext("bean.xml");
    }

    @AfterAll
    static void AfterAllTest(){
        ac.close();
    }
    @Test
    void initAndDestroyMethod(){
        UserSevice userSevice =(UserSevice) ac.getBean("UserSevice");
        Assertions.assertNotNull(userSevice);
    }
    @Test
    void InitializingBeanTest(){
        UserSevice userSevice =(UserSevice) ac.getBean("UserSevice");
        Assertions.assertNotNull(userSevice);

    }
    @Test
    void DisposableBeanTest(){
        UserSevice userSevice =(UserSevice) ac.getBean("UserSevice");
        Assertions.assertNotNull(userSevice);
    }
}
