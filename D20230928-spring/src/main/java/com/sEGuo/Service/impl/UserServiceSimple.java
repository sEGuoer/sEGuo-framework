package com.sEGuo.Service.impl;

import com.sEGuo.Dao.UserDao;
import com.sEGuo.Service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Component
public class UserServiceSimple implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public String add() {
        userDao.insert();
        return "UserServiceSimple.add";
    }
    public String mdFileToHtmlFile(String resource,String title ,String content) throws IOException {
    return "";
    }
}
