package com.seguo.mybatis.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@ComponentScan("com.seguo.mybatis.controller")
@EnableWebMvc
public class MyWebConfig implements HandlerInterceptor , WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new InterceptorConfig("x")).addPathPatterns("/HelloSpringWebMvc/*").excludePathPatterns("/HelloSpringWebMvc/j");
        registry.addInterceptor(new InterceptorConfig("y")).addPathPatterns("/HelloSpringWebMvc/*").excludePathPatterns("/HelloSpringWebMvc/j");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp();
    }
}
