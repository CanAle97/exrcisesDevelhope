package it.develhope.Swagger1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *Provide a default controller for the root with a welcome message (e.g. for someone who visit `localhost:1234`)
 *
 * @author Alessandro Canulli
 */

@RestController
public class DefaultController {
    private String sWelcome = "Welcome to port: 1234....";
    private String sTry = "Try with '/name' or '/swagger-ui'";

    @GetMapping
    public String getsWelcome() {
        return sWelcome + sTry;
    }
}