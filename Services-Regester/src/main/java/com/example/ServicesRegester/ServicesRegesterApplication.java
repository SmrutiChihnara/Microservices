package com.example.ServicesRegester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServicesRegesterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesRegesterApplication.class, args);
	}

}
