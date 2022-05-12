package org.example.config;

import org.example.entity.Person;
import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ConditionalOnMissingBean(Person.class)
@Import(value = ImportBeanDefinitionRegistrarImpl.class)
//@Configuration
public class ImportForImportBeanDefinitionRegistrar implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return this.context;
    }

}