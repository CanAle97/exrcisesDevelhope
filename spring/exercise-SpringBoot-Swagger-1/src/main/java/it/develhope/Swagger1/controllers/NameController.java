package it.develhope.Swagger1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {
    private String name = "Alessandro";

    @GetMapping(value = "")
    public String getName() {
        return name;
    }
}