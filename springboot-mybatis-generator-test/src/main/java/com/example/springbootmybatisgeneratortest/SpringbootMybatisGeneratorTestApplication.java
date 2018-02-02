package com.example.springbootmybatisgeneratortest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbootmybatisgeneratortest.mapper")
public class SpringbootMybatisGeneratorTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisGeneratorTestApplication.class, args);
	}
}
