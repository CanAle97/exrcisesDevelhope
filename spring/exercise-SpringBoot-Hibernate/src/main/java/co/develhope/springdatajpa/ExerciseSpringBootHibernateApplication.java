package co.develhope.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *Exercise - Spring Boot - Hibernate
 * write a Spring Boot application that uses the following dependencies:
 *   `Lombok`
 *   `Spring Boot DevTools`
 *   `Spring Web`
 *   `Spring Data JPA`
 *   `MySQL Driver`
 * use `hibernate` and `JPA` to connect to a local mysql database (e.g. `devdb`)
 * the `ddl-auto` parameter has to be configured in a way that `hibernate` will create and then destroy the schema at the end of the session
 * consider the following use case:
 *   `1 student ---> n enrollments`
 *   `1 class ---> n enrollments`
 * using the right annotations and considering, write the code that will create:
 *
 * @author Alessandro Canulli
 */

@SpringBootApplication
public class ExerciseSpringBootHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseSpringBootHibernateApplication.class, args);
	}

}