package com.sEGuo.sevice;

public interface UserSevice {

    default String userLogin(String email,String pwd){return "";}
}
