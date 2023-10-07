package com.sEGuo.mybatis.Service;

import com.sEGuo.mybatis.po.User;

import java.io.IOException;

public interface UserService {
    String add();
    String selectUsersByName(String title) throws IOException;
    String deleteUsersByID(String id) ;
    String addNewUser(User user) ;
    String changeUsersByID(String id,String newName) throws IOException;
}
