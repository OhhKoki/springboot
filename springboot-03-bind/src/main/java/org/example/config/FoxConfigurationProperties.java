package org.example.config;

import org.example.entity.Fox;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:fox.properties")
@EnableConfigurationProperties(value = Fox.class)
public class FoxConfigurationProperties {
}
