package D20230927.mybatis.mapper;

import D20230927.mybatis.Dao.UserDao;
import D20230927.mybatis.po.User;

import java.util.List;

public interface UserMapper extends UserDao {
    @Override
    void saveWithoutTransactional(User user);

    @Override
    void saveWithTransactional(User user);

    @Override
    List<User> selectUsersByName(String name);
}
