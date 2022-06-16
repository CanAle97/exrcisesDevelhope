package it.develhope.dependencyInjection.controllers;

import it.develhope.dependencyInjection.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *define a controller called `MyController` where you have:
 *  a private variable `MyService`
 *  a constructor
 *  a mapping to `/getName` in order to return the result of the `getName()` method of the `MyService` variable
 *  a mapping to default root `/` that prints a welcome message
 *
 * @author Alessandro Canulli
 */

@RestController
public class MyController {
    private MyService myService;

    public MyController(MyService myService) {
        System.out.println("MyController constructor was called");
        this.myService = myService;
    }

    @GetMapping
    public String welcomeMessage() {
        return "Welcome to our site";
    }

    @GetMapping("/getName")
    public String getName() {
        return myService.getName();
    }
}