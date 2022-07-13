package co.develhope.customQueries2.controllers;

import co.develhope.customQueries2.entities.Flight;
import co.develhope.customQueries2.entities.Status;
import co.develhope.customQueries2.repositories.FlightRepository;
import co.develhope.customQueries2.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private FlightService flightService;

    @PostMapping(value = {"/add", "/add/{n}"})
    public String addFlights(@PathVariable(required = false) Integer n) {
        if(n == null){
            n = 100;
        }

        List<Flight> flights = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Flight flight = new Flight();
            flight.setId(flight.getId());
            flight.setDescription(flightService.generateString(17));
            flight.setFromAirport(flightService.generateString(8));
            flight.setToAirport(flightService.generateString(8));
            flight.setStatus(flightService.randomStatus());
            flights.add(flight);
        }
        flightRepository.saveAll(flights);
        return n +" flights added";
    }

    @GetMapping(value = {"/all/fromAirport/asc", "/all/fromAirport/asc/{page}/{size}"})
    public Page<Flight> getAllFlightsByFromAirportAsc(@PathVariable(required = false) Integer page, @PathVariable(required = false) Integer size){
        if(page == null && size == null){
            page = 0;
            size = 50;
        }

        return flightRepository.findAll(PageRequest.of(page, size, Sort.by("fromAirport").ascending()));
    }

    @GetMapping(value = {"/all/{status}", "/all/{status}/{page}/{size}"})
    public Page<Flight> getAllFlightsByStatus(@PathVariable Status status, @PathVariable(required = false) Integer page, @PathVariable(required = false) Integer size) {
        if(page == null && size == null){
            page = 0;
            size = 50;
        }

        return flightRepository.findAllByStatus(status, PageRequest.of(page, size));
    }

    @GetMapping(value = {"/all/{p1}/{p2}", "/all/{p1}/{p2}/{page}/{size}"})
    public Page<Flight> getCustomFlight(@PathVariable String p1, @PathVariable String p2, @PathVariable(required = false) Integer page, @PathVariable(required = false) Integer size){
        if(page == null && size == null){
            page = 0;
            size = 50;
        }

        return flightRepository.getCustomFlight(p1, p2, PageRequest.of(page, size));
    }
}