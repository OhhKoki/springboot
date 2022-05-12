package org.example;

import org.example.config.ImportForClass;
import org.example.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ImportForClassTest {

    @Autowired
    private ImportForClass config;

    @Test
    public void testImportForClass(){
        ApplicationContext context = config.getApplicationContext();
        Person person = context.getBean("org.example.entity.Person", Person.class);
        System.out.println(person);
    }

}
