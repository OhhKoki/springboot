package org.example.config;

import org.example.entity.Person;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = Person.class)    // 通过 Class 注入的组件，会调用组件的无参构造进行实例化，组件的 id 为该组件的全限定类名
//@Import(value = {Person.class, Pet.class})
//@Configuration
public class ImportForClass implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return this.context;
    }

}
