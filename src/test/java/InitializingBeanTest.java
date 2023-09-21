import com.sEGuo.sevice.UserSevice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitializingBeanTest {
    @Test
    void InitializingBean(){
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        UserSevice userSevice =(UserSevice) ac.getBean("UserSevice");
        Assertions.assertNotNull(userSevice);
    }
}
