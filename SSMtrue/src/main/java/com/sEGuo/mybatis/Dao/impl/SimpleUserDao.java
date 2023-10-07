package com.sEGuo.mybatis.Dao.impl;

import com.sEGuo.mybatis.Dao.UserDao;
import com.sEGuo.mybatis.po.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleUserDao implements UserDao {
    @Override
    public String selectBlogContent(String title) {
        return "1";
    }

    @Override
    public List<User> selectUsersByName(String name){
        List<User> list = new ArrayList<>();
        list.add(new User(1,"asd"));
        return list;
    }
}
