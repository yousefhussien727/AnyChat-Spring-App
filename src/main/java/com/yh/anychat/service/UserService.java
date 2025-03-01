package com.yh.anychat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yh.anychat.model.User;
import com.yh.anychat.repository.RoomRepository;
import com.yh.anychat.repository.UserRepository;

import org.springframework.transaction.annotation.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor // Automatically generates the constructor
public class UserService {
    private final UserRepository userRepository;
    private final RoomRepository roomRepository;

    // Fetching all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Saving user
    @Transactional // for Data Integrity
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Fetching user by ID
    public User getUserById(Long id) {
        return userRepository.findById(id)
            .orElseThrow();
    }

    // Deleting user by ID
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    // Updating user by ID
    @Transactional // for Data Integrity
    public User updateUserById(Long id, User user) {
        User existingUser = userRepository.findById(id)
            .orElseThrow();
        existingUser.setUsername(user.getUsername());
        existingUser.setPassword(user.getPassword());
        return userRepository.save(existingUser);
    }

    // Fetching user by Name
    public User getUserByName(String username) {
        return userRepository.findByUsername(username)
            .orElseThrow();
    }

    // Update user display color
    @Transactional // for Data Integrity
    public User updateUserColor(Long id, String color) {
        User existingUser = userRepository.findById(id)
            .orElseThrow();
        existingUser.setDisplayColor(color);
        return userRepository.save(existingUser);
    }
}
