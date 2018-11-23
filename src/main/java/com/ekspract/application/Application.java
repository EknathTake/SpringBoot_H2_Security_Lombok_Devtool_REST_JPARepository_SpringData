package com.ekspract.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.ekspract.model")
@ComponentScans(value = { @ComponentScan(basePackages = "com.ekspract.controller"),
		@ComponentScan(basePackages = "com.ekspract.service"),
		@ComponentScan(basePackages = "com.ekspract.application"),
		@ComponentScan(basePackages = "com.ekspract.restsecurity") })
@EnableJpaRepositories(basePackages = { "com.ekspract.repository" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
