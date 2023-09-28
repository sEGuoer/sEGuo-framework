package D20230927.mybatis.Service.impl;

import D20230927.mybatis.Service.UserService;
import D20230927.mybatis.po.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserSeviceImpl implements UserService {
    @Autowired

    @Override
    public void saveWithoutTransactional(User user) {

    }

    @Override
    public void saveWithTransactional(User user) {

    }

    @Override
    public List<User> selectUsersByName(String name) {
        return null;
    }
}
