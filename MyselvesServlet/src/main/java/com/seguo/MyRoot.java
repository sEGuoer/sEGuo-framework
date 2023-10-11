package com.seguo;

import com.seguo.Filter.SimplyFilter;
import com.seguo.Listener.SimplyListener;
import com.seguo.servlet.DispatcherServlet;
import jakarta.servlet.*;
import org.springframework.web.servlet.FrameworkServlet;

public class MyRoot implements MyRootFather {
    @Override
    public String getRoot() {
        MyTestClass myTestClass = new MyTestClass();
        System.out.println(myTestClass.getName());
        System.out.println("getRoot");
        return "getRoot";
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        registerServletListener(servletContext);
        servletContext.addServlet("dispatcher", DispatcherServlet.class);
        registerServletFilter(servletContext);
    }
    protected void registerServletFilter(ServletContext servletContext) {
        servletContext.addFilter("SimplyFilter", SimplyFilter.class);
    }
    protected void registerServletListener(ServletContext servletContext) {
        servletContext.addListener(SimplyListener.class);
    }

}
