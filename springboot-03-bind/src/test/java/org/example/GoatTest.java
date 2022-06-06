package org.example;

import org.example.entity.Goat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class GoatTest {

    @Autowired
    private Goat goat;

    @Test
    public void test() {
        // Goat(name=shanyang, age=1)
        System.out.println(goat);
    }

}
