package com.roller_speed.app.dashboard.service;

import java.util.List;
import java.util.Optional;
import com.roller_speed.app.dashboard.model.entity.Class;

public interface IClassService {
    List<Class> getAllClasses();
    Optional<Class> getClassById(Long id);
    List<Class> getClassesByInstructorId(Long instructorId);
    Class saveClass(Class classSession);
    void deleteClass(Long id);
}
