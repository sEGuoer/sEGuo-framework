package Mybatis;

import com.sEGuo.mybatis.Config.AppConfig;
import com.sEGuo.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringJUnitConfig(AppConfig.class)
public class MybatisConfigTest {
    @Autowired
    UserMapper userMapper;
    @Test
    void test(){

//            User user = new User("person","12938123@213","mypwd","12930123921");
//            User user1 = mapper.getUser("12938123@213");
        Date date = new Date();
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String loginTime = dateformat.format(date);
        int user_id = userMapper.getUser_id("709074535@qq.com");
        System.out.println(user_id);
//            int id = mapper.insertUser(user);

//            System.out.println(id);
//            System.out.println(user1);
    }

}
