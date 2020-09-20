package com.example.CouldGetway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CouldGetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouldGetwayApplication.class, args);
	}

}
