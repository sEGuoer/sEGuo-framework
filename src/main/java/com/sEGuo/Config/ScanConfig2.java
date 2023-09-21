package com.sEGuo.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
/*
* @ComponentScan.Filter(type = FilterType.REGEX ,pattern = ".*Controller.*") 使用正则
* @ComponentScan.Filter(type = FilterType.ANNOTATION )  按照注解
* @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE )  按照给定的类型
* @ComponentScan.Filter(type = FilterType.ASPECTJ )  使用ASPECTJ表达式
* @ComponentScan.Filter(type = FilterType.CUSTOM )  使用自定义规则
* classes指定过滤的类
* */
@ComponentScan(basePackages = "com.sEGuo",useDefaultFilters = false, includeFilters = {
        @ComponentScan.Filter(type = FilterType.REGEX ,pattern = ".*Controller.*")
})
public class ScanConfig2 {
}
