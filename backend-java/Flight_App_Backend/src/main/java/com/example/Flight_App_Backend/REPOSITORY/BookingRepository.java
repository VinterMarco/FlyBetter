package com.example.Flight_App_Backend.REPOSITORY;


import com.example.Flight_App_Backend.MODEL.Booking;
import com.example.Flight_App_Backend.MODEL.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    @Query("SELECT b.user FROM Booking b WHERE b.flight.id = :flightId")
    List<User> findUsersByFlightId(Long flightId);
}
