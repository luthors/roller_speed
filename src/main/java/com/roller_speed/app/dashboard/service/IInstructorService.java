package com.roller_speed.app.dashboard.service;

import java.util.List;
import java.util.Optional;

import com.roller_speed.app.dashboard.model.entity.Instructor;

public interface IInstructorService {
    List<Instructor> getAllInstructors();
    Optional<Instructor> getInstructorById(Long id);
    Instructor saveInstructor(Instructor instructor);
    void deleteInstructor(Long id);
}
