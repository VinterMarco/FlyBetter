package com.example.Flight_App_Backend.SERVICE;


import com.example.Flight_App_Backend.MODEL.Flight;
import com.example.Flight_App_Backend.MODEL.User;
import com.example.Flight_App_Backend.REPOSITORY.BookingRepository;
import com.example.Flight_App_Backend.REPOSITORY.FlightRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FlightService {


    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private BookingRepository bookingRepository;


    public void addFlight(Flight flight) {
        flightRepository.save(flight);
    }

    public Map<String, Object> getPassengerFlightList(Long flightId) {
        Flight flight = flightRepository.findById(flightId)
                .orElseThrow(() -> new EntityNotFoundException("Flight not found with id: " + flightId));

        List<User> users = bookingRepository.findUsersByFlightId(flightId);
        Map<String, Object> response = new HashMap<>();

        Map<String, Object> flightDetails = new HashMap<>();
        flightDetails.put("id", flight.getId());
        flightDetails.put("departureAirport", flight.getDepartureAirport());
        flightDetails.put("destinationAirport", flight.getDestinationAirport());
        flightDetails.put("users", users);
        response.put("flight", flightDetails);

        return response;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }




}
