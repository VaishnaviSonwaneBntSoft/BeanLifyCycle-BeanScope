package com.springCoreAnnotion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigForUniversity {
    public ConfigForUniversity()
    {
        System.out.println("ConfigUniversity Loaded");
    }


    @Bean
    public University UniBean()
    {
        return new University();
    }
}
