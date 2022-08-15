package com.example.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext con = SpringApplication.run(FirstSpringBootApplication.class, args);

        Person a = con.getBean(Person.class);

        a.show();
    }

}
