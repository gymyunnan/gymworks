package com.example.ch7

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@MapperScan("com.example.ch7.mapper")
class Ch7Application {

    static void main(String[] args) {
        SpringApplication.run(Ch7Application, args)
    }

}
