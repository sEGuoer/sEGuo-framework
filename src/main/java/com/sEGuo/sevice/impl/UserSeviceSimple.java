package com.sEGuo.sevice.impl;

import com.sEGuo.sevice.UserSevice;
import com.sEGuo.dao.UserDao;
import com.sEGuo.pojo.User;
import org.springframework.beans.factory.InitializingBean;


public class UserSeviceSimple implements UserSevice {
    protected UserDao userSimple;

    public UserSeviceSimple(UserDao userSimple) {
        this.userSimple = userSimple;
    }


    public String userLogin(String email, String pwd){
        User user = userSimple.getUserByEmail(email,pwd);
        return "email="+user.getEmail()+" password="+user.getPassword();
    }


    public void init() {
        System.out.println("UserSeviceSimple.init");
    }

    public void destroy() {
        System.out.println("UserSeviceSimple.destroy");
    }

}