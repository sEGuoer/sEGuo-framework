package com.sEGuo.mybatis.Service.impl;

import com.sEGuo.mybatis.Dao.UserDao;
import com.sEGuo.mybatis.Service.UserService;
import com.sEGuo.mybatis.mapper.UserMapper;
import com.sEGuo.mybatis.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.io.IOException;

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
    public String addNewUser(User user) {
        userMapper.addNewUser(user);
        return "addNewUser.success";
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
    public String selectUsersByName(String title) {
        return userMapper.selectBlogContent(title);
    }
}
