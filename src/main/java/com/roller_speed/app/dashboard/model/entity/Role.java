package com.roller_speed.app.dashboard.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;  // Example: ADMIN_ROLE, INSTRUCTOR_ROLE, CANDIDATE_ROLE, STUDENT_ROLE
}