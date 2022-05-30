package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(value = "classpath:cow.xml")
@Configuration
public class CowConfig {

}
