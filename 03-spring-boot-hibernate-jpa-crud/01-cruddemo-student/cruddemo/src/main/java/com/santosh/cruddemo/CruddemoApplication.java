package com.santosh.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	/*
	*
	*  Below Code CommandLineRunner From the Spring Boot Framework Defining a new Bean.
	* */

	@Bean
	public CommandLineRunner commandLineRunner(String[] args){

		/* Short-cut notation of Lambda Expression providing an Implementation of CommandLineRunner Interface
		 *
		 *  Execute after the Spring Beans have been loaded
		 */
		return runner ->{
			System.out.println("Hello World");
		};
	}

}
