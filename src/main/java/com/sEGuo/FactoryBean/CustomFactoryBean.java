package com.sEGuo.FactoryBean;


import org.springframework.beans.factory.FactoryBean;

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
}
