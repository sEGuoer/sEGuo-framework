package com.seguo;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HandlesTypes;

import java.util.Set;


@HandlesTypes(MyRootFather.class)
public class MyTestClassSum implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        Object[] array = set.toArray();
        for (Object o:array){
            System.out.println(o);
        }
    }
}
