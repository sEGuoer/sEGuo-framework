package com.sEGuo.atImportResource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration("ImportResourceConfig")
@ImportResource(locations = "classpath:beanDemo.xml")
public class ImportResourceConfig {
}
