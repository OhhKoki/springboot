package org.example.config;

import org.example.entity.Goat;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = Goat.class)
public class GoatConfigurationProperties {
}
