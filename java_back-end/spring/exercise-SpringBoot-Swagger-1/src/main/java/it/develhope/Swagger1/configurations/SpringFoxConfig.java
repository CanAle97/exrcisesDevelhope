package it.develhope.Swagger1.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/**
 *Expose the swagger with some `ApiInfo` and 1 random `Tag` regarding the `name-controller` that returns your name
 * run the Spring application on port `1234`
 *
 * @author Alessandro Canulli
 */

@Configuration
public class SpringFoxConfig {

    @Bean
    public Docket api() {

        ApiInfo apiInfo = new ApiInfo(
                "Exercise Spring Boot Swagger 1",
                "Write a Spring Boot application with Swagger",
                "1.0.0",
                "https://www.universoastronomia.com/wp-content/uploads/2022/01/M31_HstSubaruGendler_5000-scaled.jpg",
                new Contact("Alessandro", "https://github.com/canulli", "canullialessandro@icloud.com"),
                "Digital5",
                "https://digital5.it/verify/EF-CD7B600D65",
                Collections.emptyList()
        );

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo)
                .tags(
                        new Tag("name-controller", "The name controller")
                );
    }
}