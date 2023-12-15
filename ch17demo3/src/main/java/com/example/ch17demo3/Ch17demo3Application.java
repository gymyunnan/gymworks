package com.example.ch17demo3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ch17demo3.mapper")
public class Ch17demo3Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch17demo3Application.class, args);
    }

}
