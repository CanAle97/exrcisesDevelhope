package it.develhope.firstAPI5.controllers;

import it.develhope.firstAPI5.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 *A `CarController` that:
 *   is mapped on `cars`
 *   on a `GET` request returns a new `Car` as response
 *   on a `POST` request prints the `Car` body in console and returns an HTTP `Created` success message to the user
 *   takes care of the request body validation
 *
 * @author Alessandro Canulli
 */

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping("")
    public String getCar(){
        return new CarDTO("FM531TN", "Sport", 15000.99).toString();
    }



    @PostMapping("")
    public void postCar(@Valid @RequestBody CarDTO car, HttpServletResponse response){
        System.out.println("Car: " + car.toString());
        response.setStatus(201);
    }
}