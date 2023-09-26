package com.sEGuo.autoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "AutowiredPrimaryBean")
public class AutowiredPrimaryBean {
    @Autowired
    private PrimaryBean primaryBean;
    public PrimaryBean getPrimaryBean(){
        return primaryBean;
    }
}
