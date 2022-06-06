package org.example;

import org.example.entity.Fox;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class FoxTest {

    @Autowired
    private Fox fox;

    @Test
    public void test() {
        // Fox(name=huli, age=1)
        System.out.println(fox);
    }

}
