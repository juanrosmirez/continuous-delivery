package com.java.gradle

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DemoApplication {

	static void main(String[] args) {
		SpringApplication.run(DemoApplication, args)
		System.out.println ("El precio es de euros");
	}

}
