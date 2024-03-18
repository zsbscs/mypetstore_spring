package com.example.mypetstore_spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mypetstore_spring.persistence")
public class MypetstoreSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MypetstoreSpringApplication.class, args);
    }

}
