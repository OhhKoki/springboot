package org.example.config;

import org.example.impl.ImportSelectorImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = ImportSelectorImpl.class)
@Configuration
public class BirdConfig {

}
