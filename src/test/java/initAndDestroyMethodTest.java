import com.sEGuo.sevice.UserSevice;
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
    }    @Test
    void initAndDestroyMethod(){
        UserSevice userSevice =(UserSevice) ac.getBean("UserSevice");
        Assertions.assertNotNull(userSevice);
        ac.close();
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
        ac.close();
        /*  此时就会显示出destroy的方法的输出结果(接口重写的方法)
          */

    }
}
