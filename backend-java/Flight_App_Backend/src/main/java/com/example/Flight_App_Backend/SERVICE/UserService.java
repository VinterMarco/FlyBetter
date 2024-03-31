package com.example.Flight_App_Backend.SERVICE;


import com.example.Flight_App_Backend.MODEL.User;
import com.example.Flight_App_Backend.REPOSITORY.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;
    public void addUser(User user) {
        userRepository.save(user);
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


    @Transactional
    public User updateUser(Long userID, User newUser) {
        Optional<User> selectedUser = userRepository.findById(userID);
        if (selectedUser.isPresent()) {
            User unwrappedSelectedUser = selectedUser.get();
            if (newUser.getFullName() != null && !newUser.getFullName().isEmpty()) {
                unwrappedSelectedUser.setFullName(newUser.getFullName());
            }
            if (newUser.getUserRole() != null) {
                unwrappedSelectedUser.setUserRole(newUser.getUserRole());
            }
            return userRepository.save(unwrappedSelectedUser);
        } else {
            return null;
        }
    }




}
