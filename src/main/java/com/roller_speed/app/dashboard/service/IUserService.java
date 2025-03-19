package com.roller_speed.app.dashboard.service;

import java.util.List;
import java.util.Optional;

import com.roller_speed.app.dashboard.model.entity.User;

public interface IUserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    Optional<User> getUserByEmail(String email);
    User saveUser(User user);
    void deleteUser(Long id);
}