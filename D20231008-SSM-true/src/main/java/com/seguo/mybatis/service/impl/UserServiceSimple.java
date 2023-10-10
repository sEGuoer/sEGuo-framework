package com.seguo.mybatis.service.impl;

import com.seguo.mybatis.po.Blog;
import com.seguo.mybatis.service.UserService;
import com.seguo.mybatis.mapper.UserMapper;
import com.seguo.mybatis.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class UserServiceSimple implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int deleteUsersByID(String id)  {
        return userMapper.deleteUsersByID(id);
    }
    @Override
    public List<Blog> selectAllBlog()  {
        return userMapper.selectAllBlog();
    }

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public List<Blog> selectBlogByPage(int page, int perpage) {
       return userMapper.selectBlogByPage(page-1,perpage);
    }

    @Override
    public int addNewUser(User user) {
        return userMapper.addNewUser(user);
    }

    @Override
    public Blog addNewBlog(Blog blog) {
        userMapper.addNewBlog(blog);
        return blog;
    }

    @Override
    public int deleteBlogByID(String id) {
        return userMapper.deleteBlogByID(id);
    }

    @Override
    public List<User> selectUsersByName(String name){
        return userMapper.selectUsersByName(name);
    }
    @Override
    public int changeUsersByID(String id,String newName) throws IOException {
        return userMapper.changeUsersByID(id,newName);
    }

    @Override
    public String add() {
        return "UserServiceSimple.add";
    }

    @Override
    public String selectBlogContent(String title) {
        return userMapper.selectBlogContent(title);
    }
}
