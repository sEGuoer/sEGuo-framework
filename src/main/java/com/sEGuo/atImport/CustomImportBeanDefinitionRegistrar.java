package com.sEGuo.atImport;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class CustomImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
         if (registry.containsBeanDefinition("com.sEGuo.atImport.Apple") && registry.containsBeanDefinition("com.sEGuo.atImport.Banana")){
             registry.registerBeanDefinition("Dog",new RootBeanDefinition(Dog.class));
         }
    }
}
