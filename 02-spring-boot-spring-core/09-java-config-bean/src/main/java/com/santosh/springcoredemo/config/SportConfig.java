package com.santosh.springcoredemo.config;

import com.santosh.springcoredemo.common.Coach;
import com.santosh.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }

}
