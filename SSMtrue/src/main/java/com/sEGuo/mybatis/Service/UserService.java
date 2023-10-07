package com.sEGuo.mybatis.Service;

import com.sEGuo.mybatis.po.User;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;

public interface UserService {
    String add();
    String selectBlogContent(String title) throws IOException;
    String deleteUsersByID(String id) ;
    String addNewUser(User user) ;

    List<User> selectUsersByName(String name);

    String changeUsersByID(String id, String newName) throws IOException;
}
