package com.sEGuo.Config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(value = "com.sEGuo.dao", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Repository.class})
})


public class ScanConfig4 {
}
