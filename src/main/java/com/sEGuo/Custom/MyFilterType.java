package com.sEGuo.Custom;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyFilterType implements TypeFilter {

    /**
     * MetadataReader:读取当前正在扫描的类信息
     * MetadataReaderFactory：MetadataReader的工厂，根据工厂可以得到其他的MetadataReader类信息
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) {
        // TODO Auto-generated method stub
        //获取当前类的注解信息
        AnnotationMetadata AnnotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前正在扫描的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类资源（类的路径）
        Resource resource = metadataReader.getResource();

        System.out.println(classMetadata.getClassName());
        return true;
    }

}
