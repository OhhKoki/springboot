package org.example;

import org.example.entity.Panda;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PandaTest {

    @Autowired
    private Panda panda;

    @Test
    public void test() {
        // Panda(name=xiongmao, age=1)
        System.out.println(panda);
    }

}
