package com.sEGuo.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;


public class AwareBean implements BeanNameAware , EmbeddedValueResolverAware, ApplicationContextAware {
    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        System.out.println("AwareBean.setEmbeddedValueResolver");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("AwareBean.setApplicationContext");
    }
}
