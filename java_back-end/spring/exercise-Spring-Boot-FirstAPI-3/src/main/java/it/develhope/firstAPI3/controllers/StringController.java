package it.develhope.firstAPI3.controllers;

import org.springframework.web.bind.annotation.*;

/**
 *Exercise - Spring Boot - First API 3
 * write a Spring Boot application with the necessary dependencies that has:
 *   a `StringController` that:
 *      is mapped on `strings`
 *      returns the concatenation of 2 strings (the first is mandatory, the second is not) params
 *      handle the case where the second string is null (we want to return just the first string)
 * test the API endpoint with `Postman`, executing 2 `GET` requests:
 *   with just the first param
 *   with both the params
 *
 * @author Alessandro Canulli
 */

@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping(value = "")
    public String strConcat(@RequestParam String str1, @RequestParam(required = false) String str2) {
        if(str2 != null) {
            return str1 + " " + str2;
        }else {
            return str1;
        }
    }
}