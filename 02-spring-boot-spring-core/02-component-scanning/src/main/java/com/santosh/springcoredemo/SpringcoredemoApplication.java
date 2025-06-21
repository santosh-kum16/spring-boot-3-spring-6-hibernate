package com.santosh.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication(
 scanBasePackages = {"com.santosh.springcoredemo",
		 "com.santosh.util"}
)
*/
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
