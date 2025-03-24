package com.roller_speed.app.dashboard.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  // Usa una tabla única para la jerarquía
@Table(name = "users")  // Esta es la única tabla de la jerarquía

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    
    @Size(min = 3, max = 100, message = "First name must be between 3 and 100 characters")
    @Column(length = 100)
    private String firstName;

    
    @Size(min = 3, max = 100, message = "Last name must be between 3 and 100 characters")
    @Column( length = 100)
    private String lastName;

    
    @Email
    @Column(unique = true, length = 100)
    private String email;

    
    @Pattern(regexp = "\\d{10}")
    @Column(length = 10)
    private String phone;

    
    @Size(min = 6)
    private String password;

    private boolean active = true;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    

    
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String isStudent() {
        return role.getName().equals("STUDENT_ROLE") ? "true" : "false";
    }

    public String isInstructor() {
        return role.getName().equals("INSTRUCTOR_ROLE") ? "true" : "false";
    }

    public String isAdmin() {
        return role.getName().equals("ADMIN_ROLE") ? "true" : "false";
    }

    public String isCandidate() {
        return role.getName().equals("CANDIDATE_ROLE") ? "true" : "false";
    }

    

}
