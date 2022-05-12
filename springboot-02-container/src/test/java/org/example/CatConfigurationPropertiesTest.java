package org.example;

import org.example.config.CatConfigurationProperties;
import org.example.entity.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CatConfigurationPropertiesTest {

    @Autowired
    private CatConfigurationProperties config;

    @Test
    public void testConfigurationProperties() {
        ApplicationContext context = config.getApplicationContext();
        Cat cat = context.getBean("cat-org.example.entity.Cat", Cat.class);
        System.out.println(cat);
    }

}
