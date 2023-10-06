package com.sEGuo.mybatis.Dao;


import com.sEGuo.mybatis.po.User;

import java.util.List;

public interface UserDao {


    List<User> selectUsersByName(String name);
}
