package com.sEGuo.atImport;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration(value = "ImportConfig")
@Import({Apple.class, Banana.class, CustomImportSelector.class})
public class ImportConfig {

}
