package it.develhope.swagger2.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public interface WelcomeMsg {
    String sWelcome = "Welcome to port: 5050....";

    @GetMapping(value = "")
    String getsWelcome();
}