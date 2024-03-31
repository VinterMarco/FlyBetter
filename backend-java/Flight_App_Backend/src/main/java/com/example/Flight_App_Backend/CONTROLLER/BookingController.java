package com.example.Flight_App_Backend.CONTROLLER;


import com.example.Flight_App_Backend.MODEL.Booking;
import com.example.Flight_App_Backend.SERVICE.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;


    @PostMapping("/create")
    public void createBooking(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
    }


}
