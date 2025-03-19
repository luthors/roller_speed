package com.roller_speed.app.dashboard.repository;

import com.roller_speed.app.dashboard.model.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long> {
    List<Class> findByInstructorId(Long instructorId);
}
