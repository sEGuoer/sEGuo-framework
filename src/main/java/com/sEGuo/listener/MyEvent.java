package com.sEGuo.listener;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    private MyEventSource myEventSource;

    public MyEvent(Object source, MyEventSource myEventSource) {
        super(source);
        this.myEventSource = myEventSource;
    }
    public MyEvent(MyEventSource myEventSource) {
        super(myEventSource);
        this.myEventSource = myEventSource;
    }

    public Object getMyEventSource() {
        return myEventSource;
    }

    public void setMyEventSource(Object object) {
        this.myEventSource = myEventSource;
    }
}
