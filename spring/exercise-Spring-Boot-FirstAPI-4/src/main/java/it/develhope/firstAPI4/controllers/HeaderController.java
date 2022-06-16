package it.develhope.firstAPI4.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;

/**
 *Exercise - Spring Boot - First API 4
 * write a Spring Boot application with the necessary dependencies that has:
 *   a `HeaderController` that:
 *     is mapped on `headers`
 *     returns the host name and the host port using the headers of the request
 * test the API endpoint with `Postman`
 *
 * @author Alessandro Canulli
 */

@RestController
@RequestMapping("/headers")
public class HeaderController {

    @GetMapping("")
    public String getHeader(@RequestHeader HttpHeaders headers){
        InetSocketAddress host = headers.getHost();
        return "Host: " + host.getHostName() + ", Port: " + host.getPort();
    }
}