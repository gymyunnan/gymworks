package com.example.ch4;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ch4.mapper")
public class Ch4Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch4Application.class, args);
    }

}
