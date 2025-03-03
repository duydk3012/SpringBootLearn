package com.duydk.springcoredemo.config;

import com.duydk.springcoredemo.common.SwimCoach;
import com.duydk.springcoredemo.common.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
