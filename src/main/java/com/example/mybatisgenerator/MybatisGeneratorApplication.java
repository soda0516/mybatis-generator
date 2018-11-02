package com.example.mybatisgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MybatisGeneratorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisGeneratorApplication.class, args);
    }
}
