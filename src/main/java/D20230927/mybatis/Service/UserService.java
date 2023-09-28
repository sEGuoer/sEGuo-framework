package D20230927.mybatis.Service;

import D20230927.mybatis.po.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    void saveWithoutTransactional(User user);
    @Transactional
    void saveWithTransactional(User user);

    List<User> selectUsersByName(String name);
}
