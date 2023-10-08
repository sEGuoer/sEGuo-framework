package com.seguo.mybatis.dao.impl;

import com.seguo.mybatis.dao.UserDao;
import com.seguo.mybatis.po.Blog;
import com.seguo.mybatis.po.User;

import java.util.ArrayList;
import java.util.List;

//@Component
public class SimpleUserDao implements UserDao {

    @Override
    public String selectBlogContent(String title) {
        return "1";
    }

    @Override
    public List<Blog> selectAllBlog() {
        return null;
    }

    @Override
    public List<User> selectUsersByName(String name){
        List<User> list = new ArrayList<>();
        list.add(new User(1,"asd"));
        return list;
    }

    @Override
    public int changeUsersByID(String id,String newName) {
        return 0;
    }

    @Override
    public int addNewUser(User user) {
        return 0;
    }

    @Override
    public int addNewBlog(Blog blog) {
        return 0;
    }

    @Override
    public int deleteUsersByID(String id) {
        return 0;
    }
}
