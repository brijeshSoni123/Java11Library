package com.lib.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lib.*"})
@EnableJpaRepositories(basePackages ={"com.lib.*"})
public class BookStoreApplication {

    public static void main(String [] args){

        SpringApplication.run(BookStoreApplication.class,args);
    }
}
