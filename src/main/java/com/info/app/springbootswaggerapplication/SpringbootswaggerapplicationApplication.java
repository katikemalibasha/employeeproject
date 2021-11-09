package com.info.app.springbootswaggerapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class SpringbootswaggerapplicationApplication {

	public static void main(String[] args) {
		//System.setProperty("server.servlet.context-path", "/api/v2");
		SpringApplication.run(SpringbootswaggerapplicationApplication.class, args);
	}

}
