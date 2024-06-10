package com.springCoreAnnotion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springCoreAnnotion")
public class configForCollege {
   public configForCollege()
   {
    System.out.println("config class loaded");
   }
}
