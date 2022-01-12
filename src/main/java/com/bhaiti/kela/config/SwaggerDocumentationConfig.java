package com.bhaiti.kela.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @Author: Brain Team
 * @Datecreation: 03 abr. 2020
 * @FileName: SwaggerDocumentationConfig.java
 * @AuthorCompany: Telefonica
 * @version: 0.1
 * @Description: Clase de configuracion para swagger.
 */
@Configuration
@EnableSwagger2
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
	return new ApiInfoBuilder().title("Demo Castañeda").description("This is a sample representation of an API").license("")
		.licenseUrl("http://unlicense.org").termsOfServiceUrl("").version("1.0.0").contact(new Contact("", "", "")).build();
    }

    @Bean
    public Docket customImplementation() {
	return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.bhaiti.kela"))
		.paths(PathSelectors.any()).build().apiInfo(apiInfo());
    }

}
