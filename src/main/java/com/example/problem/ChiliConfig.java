package com.example.problem;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChiliConfig {
    @ConditionalOnBean(KidneyBean.class)
    @Bean
    public ChiliConCarne makeChiliBean(KidneyBean kidneyBean) {
        return new ChiliConCarne(kidneyBean);
    }
}
