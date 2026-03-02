package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		String name="Sandeep";
		boolean isSub= true;
		SpringApplication.run(DemoApplication.class, args);
	}

}
