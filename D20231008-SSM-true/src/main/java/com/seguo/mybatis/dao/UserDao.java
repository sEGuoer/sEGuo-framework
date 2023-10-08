package com.seguo.mybatis.dao;

import com.seguo.mybatis.po.Blog;
import com.seguo.mybatis.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    List<Blog> selectAllBlog();
    List<User> selectUsersByName(String name);
    int changeUsersByID(String id,String newName);
    int addNewUser(User user);
    int addNewBlog(Blog blog);
    int deleteUsersByID(String id);

    String selectBlogContent(String title);
}
