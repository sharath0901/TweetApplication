package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class P27EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(P27EurekaServerApplication.class, args);
	}

}
