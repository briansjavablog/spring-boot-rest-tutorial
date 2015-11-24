package com.blog.samples.boot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.blog.samples")
@EnableJpaRepositories(basePackages = "com.blog.samples.boot.rest.repository")
@EntityScan(basePackages = "com.blog.samples.boot.rest.model")
public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}