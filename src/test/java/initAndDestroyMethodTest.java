import com.sEGuo.sevice.UserSevice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class initAndDestroyMethodTest {
    @Test
    void initAndDestroyMethod(){
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        UserSevice userSevice =(UserSevice) ac.getBean("UserSevice");
        Assertions.assertNotNull(userSevice);
        ac.close();
    }
    @Test
    void InitializingBeanTest(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        UserSevice userSevice =(UserSevice) ac.getBean("UserSevice");
        Assertions.assertNotNull(userSevice);

    }
}
