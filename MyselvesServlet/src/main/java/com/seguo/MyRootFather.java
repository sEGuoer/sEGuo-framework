package com.seguo;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

public interface MyRootFather {
    public String getRoot();
    void onStartup(ServletContext servletContext) throws ServletException;
}
