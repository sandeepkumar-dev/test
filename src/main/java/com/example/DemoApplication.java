package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		int x = 100;
		String name = "Sandeep";
		String surName = "Kumar";
		boolean isSub = true;

		/*************** Error *************************/
		// fixed error
		System.out.println(x);
		System.out.println(isSub);

		System.out.println(name);
		System.out.println(surName);

		SpringApplication.run(DemoApplication.class, args);
	}

}
