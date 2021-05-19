package com.example.problem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AAKidneyConfig {
    @Bean
    public KidneyBean makeKidneyBean() {
        return new KidneyBean();
    }
}
