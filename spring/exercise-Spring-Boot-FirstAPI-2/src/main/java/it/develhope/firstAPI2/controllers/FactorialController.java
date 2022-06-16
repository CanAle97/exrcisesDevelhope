package it.develhope.firstAPI2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *Exercise - Spring Boot - First API 2
 * write a Spring Boot application with the necessary dependencies that has:
 *   a `FactorialController` where you map `factorial` in order to:
 *     reply with the factorial of the `n` path variable passed with the `GET` request
 * test the API endpoint with `Postman`, executing a `GET` request
 *
 * @author Alessandro Canulli
 */

@RestController
@RequestMapping("/factorial")
public class FactorialController {

    @GetMapping("/{n}")
    public int getFactorial(@PathVariable int n){
        int factorial = n;
        for(int i = 1; i < n; i++) {
            System.out.println(i);
            factorial*=i;
        }
        return factorial;
    }
}