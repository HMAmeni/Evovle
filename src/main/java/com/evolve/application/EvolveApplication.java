package com.evolve.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = { "com.evolve.core.domain.entities" })
@EnableJpaRepositories(basePackages = { "com.evolve.core.domain.repositories" })
@ComponentScan(basePackages = { "com.evolve.core.domain.services" })
@ComponentScan(basePackages = { "com.evolve.core.models" })
@ComponentScan(basePackages = { "com.evolve.controllers" })
@PropertySource("classpath:/application.properties")
@SpringBootApplication
public class EvolveApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvolveApplication.class, args);
	}

}
