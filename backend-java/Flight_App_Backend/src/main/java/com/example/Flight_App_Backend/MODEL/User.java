package com.example.Flight_App_Backend.MODEL;

import com.example.FlightAgency.MODEL.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

    // ======================================
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullName;
    private UserRole userRole;

    @JsonIgnore

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;
    // ======================================


    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public User() {
    }

    public User(Long id, String fullName, List<Booking> bookings, UserRole userRole) {
        this.id = id;
        this.fullName = fullName;
        this.bookings = bookings;
        this.userRole = userRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
