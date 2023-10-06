import com.sEGuo.mybatis.Config.AppConfig;
import com.sEGuo.mybatis.mapper.UserMapper;
import com.sEGuo.mybatis.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


import java.util.List;

@SpringJUnitConfig(AppConfig.class)
public class MybatisConfigTest {
    @Autowired
    UserMapper userMapper;
    @Test
    void test(){

        List<User> list = userMapper.selectUsersByName("x");
        System.out.println(list);

    }

}
