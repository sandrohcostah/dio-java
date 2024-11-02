package com.spring.exemplo_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 * Projeto gerado via Spring Initializr
 * Módulos:
 * 	Spring web
 * 	Spring data jpa
 * 	H2 database
 * 	OpenFeign
 * 
 * http://localhost:8080/swagger-ui.html
 */
@EnableFeignClients
@SpringBootApplication
public class ExemploSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploSpringApplication.class, args);
	}

}
