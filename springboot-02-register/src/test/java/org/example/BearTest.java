package org.example;

import org.example.entity.Bear;
import org.example.entity.Bird;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BearTest {

    @Autowired
    private Bear bear;

    @Test
    public void test() {
        // Bear(name=null, age=null)
        System.out.println(bear);
    }

}
