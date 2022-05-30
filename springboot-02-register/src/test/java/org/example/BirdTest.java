package org.example;

import org.example.entity.Bird;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BirdTest {

    @Autowired
    private Bird bird;

    @Test
    public void test() {
        // Bird(name=xiugou, age=3)
        System.out.println(bird);
    }

}
