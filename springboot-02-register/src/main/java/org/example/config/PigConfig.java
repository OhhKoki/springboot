package org.example.config;

import org.example.entity.Pig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = Pig.class)
//@Import(value = {Pig.class, Cat.class, Dog.class})
@Configuration
public class PigConfig {

}
