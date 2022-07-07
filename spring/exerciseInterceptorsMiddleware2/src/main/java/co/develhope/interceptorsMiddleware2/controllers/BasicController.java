package co.develhope.interceptorsMiddleware2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("")
    public String welcomeMsg(){
        return "Welcome to site";
    }
}