import com.sEGuo.dao.impl.InjectDemoUserDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    void constructorArgTest(){
        ClassPathXmlApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
        InjectDemoUserDao injectDemoUserDao =(InjectDemoUserDao) ac.getBean("InjectDemoUserDao");
        System.out.println(injectDemoUserDao.getUserByEmail("123","123"));
        Assertions.assertNull(injectDemoUserDao.getUserByEmail("123","123"));
    }
}
