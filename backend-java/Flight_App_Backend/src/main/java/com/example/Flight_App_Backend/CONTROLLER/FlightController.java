package com.example.Flight_App_Backend.CONTROLLER;


import com.example.Flight_App_Backend.MODEL.Flight;
import com.example.Flight_App_Backend.SERVICE.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/create")
    public void createFlight(@RequestBody Flight flight) {
        flightService.addFlight(flight);
    }

    @GetMapping("/passengerList/{flightID}")
    public Map<String, Object> getPassengerList(@PathVariable Long flightID) {
        return flightService.getPassengerFlightList(flightID);
    }

    @GetMapping("/all")
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

}
