package com.info.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

  @Bean
  public Docket sampledb(){
    return new Docket(DocumentationType.SWAGGER_2).select().apis(
        RequestHandlerSelectors.basePackage("com.info.app.controller")).paths(
        PathSelectors.regex("/emp.*")).build().apiInfo(metaInfo());

  }

  private ApiInfo metaInfo() {
//    return new ApiInfoBuilder().title("Springboot API")
//                               .description("Simple example program for swagger with get and post")
//                               .termsOfServiceUrl("http://localhost:9091/swagger-ui.html")
//                               .contact("katikemalibasha@gmail.com").license("Malik License")
//                               .licenseUrl("katikemalibasha@gmail.com").version("1.0").build();

    ApiInfo apiInfo=new ApiInfo("API Services","","","", new Contact("malibasha","https://www.facebook.com","basha@gmail.com"),"","");
    return apiInfo;
  }

}
