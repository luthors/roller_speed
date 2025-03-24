package com.roller_speed.app.dashboard.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.roller_speed.app.dashboard.repository.ClassRepository;
import com.roller_speed.app.dashboard.model.entity.Class;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClassServiceImpl implements IClassService {

    private final ClassRepository classRepository;

    @Override
    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    @Override
    public Optional<Class> getClassById(Long id) {
        return classRepository.findById(id);
    }

    @Override
    public List<Class> getClassesByInstructorId(Long instructorId) {
        return classRepository.findByInstructorId(instructorId);
    }

    @Override
    public Class saveClass(Class classSession) {
        return classRepository.save(classSession);
    }

    @Override
    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }

    @Override
    public List<Class> getStudentSchedule(Long studentId) {
        return classRepository.findByStudentsByStudentId(studentId);
    }
}
