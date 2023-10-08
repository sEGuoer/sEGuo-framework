package com.seguo.mybatis.mapper;


import com.seguo.mybatis.dao.UserDao;
import com.seguo.mybatis.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends UserDao {


    @Override
    List<User> selectUsersByName(@Param("name") String name);
    @Override
    List<User> selectAllBlog();
    @Override
    int changeUsersByID(String id,String newName);
    @Override
    int addNewUser(User user);
    @Override
    int deleteUsersByID(String id);
    @Override
    String selectBlogContent(@Param("title") String title);

}
