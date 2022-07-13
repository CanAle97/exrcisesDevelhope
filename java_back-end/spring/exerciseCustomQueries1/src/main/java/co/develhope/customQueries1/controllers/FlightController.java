package co.develhope.customQueries1.controllers;

import co.develhope.customQueries1.entities.Flight;
import co.develhope.customQueries1.entities.Status;
import co.develhope.customQueries1.repositories.FlightRepository;
import co.develhope.customQueries1.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private FlightService flightService;

    @PostMapping("/add")
    public String addFlights() {
        List<Flight> flights = new ArrayList<>();
        for(int i = 0; i < 50; i++) {
            Flight flight = new Flight();
            flight.setId(flight.getId());
            flight.setDescription(flightService.generateString(17));
            flight.setFromAirport(flightService.generateString(8));
            flight.setToAirport(flightService.generateString(8));
            flight.setStatus(Status.ONTIME);
            flights.add(flight);
        }
        flightRepository.saveAll(flights);
        return "50 flights added";
    }

    @GetMapping("/all")
    public List<Flight> flights() {
       return flightRepository.findAll();
    }
}