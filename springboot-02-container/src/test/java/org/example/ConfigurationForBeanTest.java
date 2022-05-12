package org.example;

import org.example.config.ConfigurationForBean;
import org.example.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ConfigurationForBeanTest {

    @Autowired
    private ConfigurationForBean config;

    /**
     * proxyBeanMethods
     *      为 true 时，会生成一个该配置类的代理对象存入容器中；
     *      为 false 时，则是直接将原始的配置类对象存入容器中；
     */
    @Test
    public void testProxyMethods() {
        // 当 @Configuration(proxyBeanMethods = true) 时，输出为：org.example.config.MyConfig$$EnhancerBySpringCGLIB$$6d0e2326@5754de72
        // 当 @Configuration(proxyBeanMethods = false) 时，输出为：org.example.config.MyConfig@1f1cae23
        System.out.println(config);
        Person person01 = config.person();
        Person person02 = config.person();
        // 当 @Configuration(proxyBeanMethods = true) 时，输出为：true
        // 当 @Configuration(proxyBeanMethods = false) 时，输出为：false
        System.out.println(person01 == person02);
    }

}
