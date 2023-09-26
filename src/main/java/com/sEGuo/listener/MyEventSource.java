package com.sEGuo.listener;

import java.util.ArrayList;
import java.util.List;

public class MyEventSource {
    private List<MyApplicationListener> list = new ArrayList<>();
    private String sourceName ;
    public void registerListener(MyApplicationListener eventListener){
        if(!list.contains(eventListener)){
            list.add(eventListener);
        }
    }
    public void removeListener(MyApplicationListener eventListener){
        if(list.contains(eventListener)){
            list.remove(eventListener);

        }
    }
    public String getSourceName() {
        return sourceName;
    }
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

}
