package com.roller_speed.app.dashboard.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "attendances")  //Asistencias
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private LocalDate attendanceDate;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class classSession;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    
    private boolean present;  // true = attended, false = absent
}