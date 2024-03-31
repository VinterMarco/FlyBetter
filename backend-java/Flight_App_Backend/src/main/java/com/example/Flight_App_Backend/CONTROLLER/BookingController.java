package com.example.Flight_App_Backend.CONTROLLER;


import com.example.Flight_App_Backend.MODEL.Booking;
import com.example.Flight_App_Backend.SERVICE.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "http://localhost:3000")

public class BookingController {

    @Autowired
    private BookingService bookingService;


    @PostMapping("/create")
    public void createBooking(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
    }


}
