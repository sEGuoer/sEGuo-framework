package com.sEGuo.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.sEGuo",useDefaultFilters = false, includeFilters = {
        @ComponentScan.Filter(type = FilterType.REGEX ,pattern = ".*Controller.*")
})
public class ScanConfig2 {
}
