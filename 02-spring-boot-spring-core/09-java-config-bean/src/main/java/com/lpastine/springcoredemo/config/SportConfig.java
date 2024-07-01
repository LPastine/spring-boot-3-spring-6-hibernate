package com.lpastine.springcoredemo.config;

import com.lpastine.springcoredemo.common.Coach;
import com.lpastine.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 1) Create @Configuration class
@Configuration
public class SportConfig {
    // 2) Define @Bean method to configure the bean
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
