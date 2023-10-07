package com.sEGuo.mybatis.mapper;


import com.sEGuo.mybatis.Dao.UserDao;
import com.sEGuo.mybatis.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserMapper extends UserDao {


    @Override
    List<User> selectUsersByName(@Param("name") String name);
    @Override
    int changeUsersByID(String id,String newName);
    @Override
    int addNewUser(User user);
    @Override
    int deleteUsersByID(String id);
    @Override
    String selectBlogContent(@Param("title") String title);

}
