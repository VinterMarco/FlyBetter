package com.example.Flight_App_Backend.SERVICE;


import com.example.Flight_App_Backend.MODEL.Booking;
import com.example.Flight_App_Backend.MODEL.Flight;
import com.example.Flight_App_Backend.MODEL.User;
import com.example.Flight_App_Backend.REPOSITORY.BookingRepository;
import com.example.Flight_App_Backend.REPOSITORY.FlightRepository;
import com.example.Flight_App_Backend.REPOSITORY.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {


    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private FlightRepository flightRepository;
    @Autowired
    private UserRepository userRepository;



    @Transactional
    public Booking addBooking(Booking booking ) {

        Flight flight = flightRepository.findById(booking.getFlight().getId())
                .orElseThrow(() -> new RuntimeException("Flight with ID " + booking.getFlight().getId() + " not found"));

        User user = userRepository.findById(booking.getUser().getId())
                .orElseThrow(() -> new RuntimeException("User with ID " + booking.getUser().getId() + " not found"));

        booking.setFlight(flight);
        booking.setUser(user);

        // Save the booking
        return bookingRepository.save(booking);

    }






}
