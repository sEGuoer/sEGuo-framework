package com.seguo;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HandlesTypes;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.WebApplicationInitializer;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;


@HandlesTypes(MyRootFather.class)
public class MyTestClassSum implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        Object[] array = set.toArray();
        for (Object o : array) {
            System.out.println(o);
        }
        List<MyRootFather> rootList = new ArrayList<>();
        for (Class<?> waiClass : set) {
            try {
                rootList.add((MyRootFather)
                        ReflectionUtils.accessibleConstructor(waiClass).newInstance());
            } catch (Throwable ex) {
                throw new ServletException("Failed to instantiate WebApplicationInitializer class", ex);
            }
        }
    }
}
