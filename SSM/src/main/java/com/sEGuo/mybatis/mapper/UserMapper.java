package com.sEGuo.mybatis.mapper;


import com.sEGuo.mybatis.Dao.UserDao;
import com.sEGuo.mybatis.po.User;

import java.util.List;

public interface UserMapper extends UserDao {


    @Override
    List<User> selectUsersByName(String name);
}
