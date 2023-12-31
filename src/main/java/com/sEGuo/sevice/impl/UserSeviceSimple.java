package com.sEGuo.sevice.impl;

import com.sEGuo.sevice.UserSevice;
import com.sEGuo.dao.UserDao;
import com.sEGuo.pojo.User;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class UserSeviceSimple implements UserSevice ,InitializingBean , DisposableBean {
    protected UserDao userSimple;

    public UserSeviceSimple(UserDao userSimple) {
        this.userSimple = userSimple;
    }


    public String userLogin(String email, String pwd){
        User user = userSimple.getUserByEmail(email,pwd);
        return "email="+user.getEmail()+" password="+user.getPassword();
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("UserSeviceSimple.afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("UserSeviceSimple.destroy");
    }
}