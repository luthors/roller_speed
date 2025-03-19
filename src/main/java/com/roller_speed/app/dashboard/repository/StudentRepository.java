package com.roller_speed.app.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roller_speed.app.dashboard.model.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}