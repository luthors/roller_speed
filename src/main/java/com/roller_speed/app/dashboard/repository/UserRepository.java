package com.roller_speed.app.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roller_speed.app.dashboard.model.entity.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    List<User> findByLastNameStartingWith(String lastName);
    //@Query("select u from User u where u.lastName like :lastName and u.firstName like :firstName")
    //User findByLastNameAndFirstName(String lastName, String firstName);
}