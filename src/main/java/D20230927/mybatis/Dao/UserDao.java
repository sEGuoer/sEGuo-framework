package D20230927.mybatis.Dao;

import D20230927.mybatis.po.User;

import java.util.List;

public interface UserDao {
    void saveWithoutTransactional(User user);
    void saveWithTransactional(User user);

    List<User> selectUsersByName(String name);
}
