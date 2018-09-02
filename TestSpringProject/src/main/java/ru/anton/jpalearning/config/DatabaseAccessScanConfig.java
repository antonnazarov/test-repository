package ru.anton.jpalearning.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"ru.anton.jpalearning.person"})
public class DatabaseAccessScanConfig {
    // no implementation is required
}
