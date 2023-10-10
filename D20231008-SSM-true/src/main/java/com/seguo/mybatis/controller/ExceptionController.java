package com.seguo.mybatis.controller;

import com.seguo.mybatis.method.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(ArithmeticException.class)
    R arithmeticException(ArithmeticException a) {
        System.out.println(a.getMessage());
        return R.ok();
    }

    @ExceptionHandler(Exception.class)
    R excepiton(Exception e) {
        System.out.println(e.getMessage());
        return R.ok();
    }
}
