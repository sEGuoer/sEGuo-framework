package com.seguo.mybatis.service.impl;

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
    public String addNewUser(User user) {
        userMapper.addNewUser(user);
        return "addNewUser.success";
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
