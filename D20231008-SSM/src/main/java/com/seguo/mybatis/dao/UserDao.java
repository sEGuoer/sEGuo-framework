package com.seguo.mybatis.dao;

import com.seguo.mybatis.po.User;

import java.util.List;

public interface UserDao {


    List<User> selectUsersByName(String name);
    int changeUsersByID(String id,String newName);
    int addNewUser(User user);
    int deleteUsersByID(String id);

    String selectBlogContent(String title);
}
