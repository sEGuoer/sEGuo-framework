package com.sEGuo.autoWired;

import org.springframework.stereotype.Component;

@Component
public class PrimaryBean {
    private String beanName = "default";

    public PrimaryBean(String beanName) {
        this.beanName = beanName;
    }
    public PrimaryBean() {
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
