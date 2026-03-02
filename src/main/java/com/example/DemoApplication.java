package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		int x = 100;
		String name = "Kumar";
		SpringApplication.run(DemoApplication.class, args);
	}

}
