package org.example.config;

import org.example.entity.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogConfig {

    @Bean
    public Dog dog() {
        return Dog.builder().name("xiugou").age(3).build();
    }

}
