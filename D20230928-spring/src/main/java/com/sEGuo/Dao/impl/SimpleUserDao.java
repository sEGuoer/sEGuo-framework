package com.sEGuo.Dao.impl;

import com.sEGuo.Dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class SimpleUserDao implements UserDao {

    @Override
    public void insert() {
        System.out.println("SimpleUserDao.insert");
    }
}
