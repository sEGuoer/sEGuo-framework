package com.sEGuo.mybatis.Service.impl;

import com.sEGuo.mybatis.Dao.UserDao;
import com.sEGuo.mybatis.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceSimple implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public String add() {
        return "UserServiceSimple.add";
    }
}
