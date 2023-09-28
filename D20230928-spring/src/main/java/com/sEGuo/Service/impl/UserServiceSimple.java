package com.sEGuo.Service.impl;

import com.sEGuo.Dao.UserDao;
import com.sEGuo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceSimple implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public String add() {
        userDao.insert();
        return "UserServiceSimple.add";
    }
}
