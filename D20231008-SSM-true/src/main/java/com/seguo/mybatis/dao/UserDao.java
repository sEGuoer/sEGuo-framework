package com.seguo.mybatis.dao;

import com.seguo.mybatis.po.Blog;
import com.seguo.mybatis.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao {

    List<Blog> selectAllBlog();
    List<Blog> selectBlogByPage(@Param("offset") int offset,@Param("rowCount") int rowCount);
    List<User> selectUsersByName(String name);
    int changeUsersByID(String id,String newName);
    int addNewUser(User user);
    int addNewBlog(Blog blog);
    int deleteUsersByID(String id);
    int deleteBlogByID(String id);
    int updateBlog(Map map);
    String selectBlogContent(String title);
}
