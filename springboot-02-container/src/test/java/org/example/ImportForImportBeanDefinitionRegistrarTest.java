package org.example;

import org.example.config.ImportForImportBeanDefinitionRegistrar;
import org.example.config.ImportForImportSelector;
import org.example.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ImportForImportBeanDefinitionRegistrarTest {

    @Autowired
    private ImportForImportBeanDefinitionRegistrar config;

    @Test
    public void testImportForImportSelector(){
        ApplicationContext context = config.getApplicationContext();
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

}
