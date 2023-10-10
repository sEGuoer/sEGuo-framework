package com.seguo.mybatis.service;

import com.seguo.mybatis.po.Blog;
import com.seguo.mybatis.po.User;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;

public interface UserService {
    String add();
    String selectBlogContent(String title) throws IOException;
    int deleteUsersByID(String id) ;
    int addNewUser(User user) ;
    Blog addNewBlog(Blog blog) ;
    int deleteBlogByID(String id);

    List<User> selectUsersByName(String name);

    int changeUsersByID(String id, String newName) throws IOException;
    public List<Blog> selectAllBlog();
    public List<User> selectAllUser();
    List<Blog> selectBlogByPage(int page,int perpage);
}
