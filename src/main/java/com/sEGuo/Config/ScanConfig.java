package com.sEGuo.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sEGuo",useDefaultFilters = true)
public class ScanConfig {
}
