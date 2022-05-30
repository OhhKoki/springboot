package org.example.config;

import org.example.impl.ImportBeanDefinitionRegistrarImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = ImportBeanDefinitionRegistrarImpl.class)
@Configuration
public class BearConfig {

}
