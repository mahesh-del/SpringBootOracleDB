package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootOracleDbApplication {

	public static void main(String[] args) {
		System.out.println("hello started");
		SpringApplication.run(SpringBootOracleDbApplication.class, args);
	}

}
