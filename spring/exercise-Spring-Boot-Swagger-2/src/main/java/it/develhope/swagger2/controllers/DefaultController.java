package it.develhope.swagger2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *Provide a default controller for the root with a welcome message (e.g. for someone who visit `localhost:5050`)
 *
 * @author Alessandro Canulli
 */

@RestController
public class DefaultController implements WelcomeMsg {
    private String sTry = "Try with '/math' or '/swagger-ui'";

    @Override
    @GetMapping(value = "")
    public String getsWelcome() {
        return sWelcome + sTry;
    }
}