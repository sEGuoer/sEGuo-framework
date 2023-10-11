package com.seguo;

public class MyRoot implements MyRootFather{
    @Override
    public String getRoot() {
        MyTestClass myTestClass = new MyTestClass();
        System.out.println(myTestClass.getName());
        System.out.println("getRoot");
        return "getRoot";
    }
}
