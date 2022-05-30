package org.example;

import org.example.entity.Pig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PigTest {

    @Autowired
    private Pig pig;

    @Test
    public void test() {
        // Pig(name=null, age=null)
        System.out.println(pig);
    }

}
