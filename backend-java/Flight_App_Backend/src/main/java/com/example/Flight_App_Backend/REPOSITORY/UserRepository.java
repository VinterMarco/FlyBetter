package com.example.Flight_App_Backend.REPOSITORY;

import com.example.Flight_App_Backend.MODEL.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
