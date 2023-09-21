package com.sEGuo.Config;


import com.sEGuo.Custom.MyFilterType;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(value="com.sEGuo.Controller",includeFilters={
        @ComponentScan.Filter(type= FilterType.CUSTOM,classes={
                MyFilterType.class
        })
})
public class ScanConfig3 {
}
