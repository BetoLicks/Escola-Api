package com.escolaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.controller")
@EntityScan("com.model")
@EnableJpaRepositories("com.repository")
@SpringBootApplication
public class EscolaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaApiApplication.class, args);
	}
}
