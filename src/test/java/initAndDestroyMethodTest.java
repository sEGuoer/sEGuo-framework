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
    @Test
    void DisposableBeanTest(){
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        UserSevice userSevice =(UserSevice) ac.getBean("UserSevice");
        Assertions.assertNotNull(userSevice);
        ac.close();
        /*  此时就会显示出destroy的方法的输出结果(接口重写的方法)
          */

    }
}
