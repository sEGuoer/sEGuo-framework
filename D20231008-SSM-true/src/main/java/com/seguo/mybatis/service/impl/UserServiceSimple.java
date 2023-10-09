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
    public String deleteUsersByID(String id)  {
        userMapper.deleteUsersByID(id);
        return "deleteSuccess";
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
    public String addNewUser(User user) {
        userMapper.addNewUser(user);
        return "addNewUser.success";
    }

    @Override
    public Blog addNewBlog(Blog blog) {
        userMapper.addNewBlog(blog);
        return blog;
    }

    @Override
    public String deleteBlogByID(String id) {
        userMapper.deleteBlogByID(id);
        return "UserServiceSimple.deleteBlogByID";
    }

    @Override
    public List<User> selectUsersByName(String name){
        return userMapper.selectUsersByName(name);
    }
    @Override
    public String changeUsersByID(String id,String newName) throws IOException {
        userMapper.changeUsersByID(id,newName);
        return "changeUsersByID.Success";
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
