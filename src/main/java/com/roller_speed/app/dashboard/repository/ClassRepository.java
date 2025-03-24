package com.roller_speed.app.dashboard.repository;

import com.roller_speed.app.dashboard.model.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long> {
    List<Class> findByInstructorId(Long instructorId);

    
    
    @Query("select c from Class c where (select s from Student s where s.id = ?1) member of c.students")
    List<Class> findByStudentsByStudentId(Long studentId);

    
    
}
