import com.sEGuo.mybatis.Config.AppConfig;
import com.sEGuo.mybatis.mapper.UserMapper;
import com.sEGuo.mybatis.po.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppConfig.class)
public class blogTest {
    @Autowired
    UserMapper userMapper;
    @Test
    @DisplayName("测试自己写的S和M结合是否可用")
    void ds(){
        System.out.println(userMapper.selectUsersByName("x"));
        System.out.println(userMapper.selectBlogContent("MySQL"));
        userMapper.addNewUser(new User("zcy"));
    }
}
