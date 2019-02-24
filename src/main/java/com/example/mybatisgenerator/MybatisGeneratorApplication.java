package com.example.mybatisgenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.example.mybatisgenerator.mapper")
public class MybatisGeneratorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisGeneratorApplication.class, args);
    }
}
