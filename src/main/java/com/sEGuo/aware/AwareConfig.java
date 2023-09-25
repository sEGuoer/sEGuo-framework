package com.sEGuo.aware;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AwareBean.class)
public class AwareConfig {
}
