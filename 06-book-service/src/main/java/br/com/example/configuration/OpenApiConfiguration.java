package br.com.example.configuration;

import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;

@OpenAPIDefinition(info = 
@Info(title = "Book Service API",
	version = "v1",
	description = "Documentation of Book Service API"))
public class OpenApiConfiguration {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.components(new Components())
				.info(
					new io.swagger.v3.oas.models.info.Info()
					.title("Book Service API")
						.version("v1")
						.license(
								new io.swagger.v3.oas.models.info.License()
								.name("Apache 2.0")
								.url("http://springdoc.org")));
	}
}
