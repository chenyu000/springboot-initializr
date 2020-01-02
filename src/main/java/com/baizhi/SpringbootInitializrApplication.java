package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
@EnableAutoConfiguration
public class SpringbootInitializrApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootInitializrApplication.class, args);
        System.out.print("I am super boy!");
        System.out.print("I am super boy too!");
        
    }

}
