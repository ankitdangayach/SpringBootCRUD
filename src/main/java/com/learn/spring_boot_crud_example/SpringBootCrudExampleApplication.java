package com.learn.spring_boot_crud_example;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Product API", version = "2.0", description = "Product Microservice"))
public class SpringBootCrudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudExampleApplication.class, args);
	}

}
