package com.sEGuo.FactoryBean;

import jakarta.annotation.PostConstruct;

public class LifecycleBeanJSR250 {
    @PostConstruct
    private void init() {
        System.out.println("CustomFactoryBean.init");
    }
    @PostConstruct
    private void destory() {
        System.out.println("CustomFactoryBean.destory");
    }
}
