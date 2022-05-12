package org.example;

import org.example.config.ImportResourceForBean;
import org.example.entity.Person;
import org.example.entity.Pet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ImportResourceForBeanTest {

    @Autowired
    private ImportResourceForBean config;

    @Test
    public void testImportResource() {
        ApplicationContext context = config.getApplicationContext();
        Person person = context.getBean("haha", Person.class);
        Pet pet = context.getBean("hehe", Pet.class);
        System.out.println(person);
        System.out.println(pet);
    }

}
