package org.example.config;

import org.example.entity.Person;
import org.example.entity.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * proxyBeanMethods：代理 bean 的方法，默认使用 full 模式：
 *      1）Full模式（proxyBeanMethods = true） --> 通过该配置类对象调用该类中的 @Bean 方法时，保证每个 @Bean 方法被不管调用多少次返回的组件都是单实例的（存入容器的是一个代理类）；
 *      2）Lite模式（proxyBeanMethods = false） --> 通过该配置类对象调用该类中的 @Bean 方法时，保证每个 @Bean 方法被不管调用多少次返回的组件都是新创建的；
 */
//@Configuration(proxyBeanMethods = true)    // 告诉 springboot 这是一个配置类，等同于 beans.xml 配置文件
public class ConfigurationForBean {

    /**
     * @Bean 的作用：往容器中添加组件
     *      1）组件id：以方法名作为组件的 id；
     *      2）组件类型：返回类型就是组件类型；
     *      3）返回的值：就是组件在容器中的实例；
     * */
    @Bean
    public Person person() {
        return Person.builder().name("zhangsan").age(18).pet(pet()).build();
    }

    @Bean
    public Pet pet() {
        return Pet.builder().name("gaogao").age(1).build();
    }

}
