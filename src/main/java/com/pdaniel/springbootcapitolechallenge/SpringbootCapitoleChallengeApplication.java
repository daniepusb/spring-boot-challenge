package com.pdaniel.springbootcapitolechallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.pdaniel.springbootcapitolechallenge.domain.model")
@ComponentScan("com.pdaniel.springbootcapitolechallenge")
@EnableJpaRepositories("com.pdaniel.springbootcapitolechallenge.infrastructure.repository")
public class SpringbootCapitoleChallengeApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootCapitoleChallengeApplication.class, args);
	}
}
