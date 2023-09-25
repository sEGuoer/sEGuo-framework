package com.sEGuo.atValue;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:valueBean.properties")
public class ValueBean {
    @Value("haha")
    private String text;
    @Value ("${valueBean.description}")
    private String description;
    @Value ("#{1+1}")
    private Integer math;


    @Override
    public String toString() {
        return "ValueBean{" +
                "text='" + text + '\'' +
                ", description='" + description + '\'' +
                ", math=" + math +
                '}';
    }
}
