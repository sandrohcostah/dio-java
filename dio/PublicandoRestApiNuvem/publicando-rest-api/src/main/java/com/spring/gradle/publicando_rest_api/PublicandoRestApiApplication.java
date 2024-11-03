package com.spring.gradle.publicando_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PublicandoRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicandoRestApiApplication.class, args);
	}

}
/*
* Precisa configurar a variável de ambiente
* No Intellij, vai nos 3 pontinhos do lado do run e edit config
* Vai no + >> Application >> Enverionment variables
* SPRING_PROFILES_ACTIVE e no value: dev
*/