package D20230927;

import D20230927.aop.Config.StartTimeConfig;
import D20230927.aop.dao.UserDao;
import D20230927.aop.dao.imp.UserDaoImp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class aopTest {
    @Test
    @DisplayName("对所有方法方法或者所有包代替的话在@Pointcut中将对应的改为*，*就代表全部")
    void aop(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(StartTimeConfig.class);
        UserDao userDao = (UserDao)ac.getBean("userDaoImp");
        userDao.create();
        System.out.println("--------------");
        userDao.destroy();
        System.out.println("--------------");
        userDao.start();
        System.out.println("--------------");
        userDao.update();
    }
}
