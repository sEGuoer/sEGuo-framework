package com.sEGuo.FactoryBean;

public class CustomBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomBean(String name) {
        this.name = name;
    }
}
