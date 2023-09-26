package com.sEGuo.mybatis.mapper;


import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.sEGuo.mybatis.Dao.UserDao;
import com.sEGuo.mybatis.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
@Service(value = "userService")
public interface UserMapper extends UserDao {

    List<User> tableinfo(int id);
    User UserInfo(int id);
    int add(@Param("email")String email,@Param("password") String password, @Param("account")String account,@Param("a") boolean verifyCodeIsCorrect);
    int add_Operation_record(@Param("user_id") int user_id,@Param("time") String time,@Param("operation")String operation);
    int update(@Param("email")String email, @Param("account")String account, @Param("password")String password, @Param("updateEmail") String updateEmail);
    int updateUser(Map map);
    int deleteUser(Map map);
    int updateLoginTime( @Param("email")String email,@Param("loginTime") String loginTime);
    int addUser(Map map);
    int deleteManyUser(int[] ints);
    List<User> searchBlog(@Param("title")String title, @Param("content")String content);
    List<User> searchBlog(User user);
    List<User> searchBlog(Map map);

}
