package D20230927.aop.dao.imp;

import D20230927.aop.dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImp implements UserDao {
    @Override
    public void create() {
        long startTime = System.currentTimeMillis();
        System.out.println("startTime=" + startTime);
        System.out.println("UserDaoImp.create");
    }

    @Override
    public void start() {
        System.out.println("UserDaoImp.start");
    }

    @Override
    public void update() {
        System.out.println("UserDaoImp.update");
    }

    @Override
    public void destroy() {
        System.out.println("UserDaoImp.destroy");
    }
}
