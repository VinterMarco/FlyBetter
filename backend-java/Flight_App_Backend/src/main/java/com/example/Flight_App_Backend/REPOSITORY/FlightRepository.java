package com.example.Flight_App_Backend.REPOSITORY;


import com.example.Flight_App_Backend.MODEL.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
