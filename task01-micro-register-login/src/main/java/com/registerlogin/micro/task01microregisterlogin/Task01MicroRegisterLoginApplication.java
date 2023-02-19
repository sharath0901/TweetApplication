package com.registerlogin.micro.task01microregisterlogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableAutoConfiguration
@EnableFeignClients
public class Task01MicroRegisterLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(Task01MicroRegisterLoginApplication.class, args);
	}

	
	
	
	
}
