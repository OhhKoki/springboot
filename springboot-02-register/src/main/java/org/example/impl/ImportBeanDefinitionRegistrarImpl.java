package org.example.impl;

import org.example.entity.Bear;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class ImportBeanDefinitionRegistrarImpl implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinition personDefinition = new RootBeanDefinition(Bear.class);
        // 要注册什么 Bean 就往 BeanDefinitionRegistry 中添加该 Bean 的 BeanDefinition
        registry.registerBeanDefinition("bear", personDefinition);    // 参数1：组件id
    }

}
