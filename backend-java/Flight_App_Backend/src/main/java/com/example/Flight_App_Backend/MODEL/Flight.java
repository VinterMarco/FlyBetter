package com.example.Flight_App_Backend.MODEL;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Flight {



    // ======================================
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String destinationAirport;
    private String departureAirport;

    @JsonIgnore

    @OneToMany(mappedBy = "flight")
    private List<Booking> bookings;

    // ======================================


    public Flight(Long id, String destinationAirport, String departureAirport, List<Booking> bookings) {
        this.id = id;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.bookings = bookings;
    }

    public Flight() {
    }



    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destination) {
        this.destinationAirport = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureLocation) {
        this.departureAirport = departureLocation;
    }
}
