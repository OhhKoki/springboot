package org.example;

import org.example.entity.Dog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DogConfigurationPropertiesTest {

    @Autowired
    private Dog dog;

    @Test
    public void testConfigurationProperties() {
        System.out.println(dog);
    }

}
