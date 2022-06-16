package it.develhope.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *Exercise - Spring Boot - Dependency Injection
 * create a `Spring Boot` application using `Spring Initializr` that has the following dependencies:
 *  `Lombok`
 *  `Spring Boot DevTools`
 *  `Spring Web`
 *
 *
 *notify the user through the console when a constructor or a method has been called:
 *  e.g. `MyService.getName() has been called`
 *
 *
 *when you launch and test your application on your `localhost`, you should see the following calls stack (in this order):
 *  before calling `localhost:[portnumber]`:
 *    `MyComponent constructor`
 *    `MyService constuctor`
 *    `MyContr0oller constructor`
 *  after calling `localhost:[portnumber]/getName`
 *    `MyService.getName()`
 *    `MyComponent.getMyComponentName()`
 *
 * @author Alessandro Canulli
 */

@SpringBootApplication
public class ExerciseSpringBootDependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseSpringBootDependencyInjectionApplication.class, args);
	}
}