package org.example;

import org.example.entity.Cat;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CatTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("cat.xml");
        Cat cat = context.getBean("cat", Cat.class);
        // Cat(name=xiaomao, age=3)
        System.out.println(cat);
    }

}
