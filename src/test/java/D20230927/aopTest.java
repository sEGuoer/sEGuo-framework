package D20230927;

import D20230927.aop.Config.StartTimeConfig;
import D20230927.aop.dao.UserDao;
import D20230927.aop.dao.imp.UserDaoImp;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class aopTest {
    @Test
    void aop(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(StartTimeConfig.class);
        UserDao userDao = (UserDao)ac.getBean("userDaoImp");
        userDao.create();
    }
}
