package com.sEGuo.mybatis.Service.impl;

import com.sEGuo.mybatis.Dao.UserDao;
import com.sEGuo.mybatis.Service.UserService;
import com.sEGuo.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.io.IOException;

@Component
public class UserServiceSimple implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String add() {
        return "UserServiceSimple.add";
    }

    @Override
    public String bdd(String title) throws IOException {
        return userMapper.selectBlogContent(title);
    }
}
