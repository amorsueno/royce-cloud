package com.royce.cloud.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RoyceRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoyceRegisterApplication.class, args);
	}

}
