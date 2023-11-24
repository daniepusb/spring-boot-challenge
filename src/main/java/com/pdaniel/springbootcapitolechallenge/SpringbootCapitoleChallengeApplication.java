package com.pdaniel.springbootcapitolechallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.pdaniel.springbootcapitolechallenge")
public class SpringbootCapitoleChallengeApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootCapitoleChallengeApplication.class, args);
	}
}
