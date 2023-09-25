package com.sEGuo.FactoryBean;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;


@Component
public class CustomFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return new CustomBean("Custombean");
    }

    @Override
    public Class<?> getObjectType() {
        return CustomBean.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    private void init() {
        System.out.println("CustomFactoryBean.init");
    }
    private void destory() {
        System.out.println("CustomFactoryBean.destory");
    }
}
