package com.roller_speed.app.dashboard.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@DiscriminatorValue("INSTRUCTOR")  // Define el tipo en la columna 'user_type'
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Instructor extends User {

    @Column(nullable = false)
    private int yearsExperience;

    @NotBlank(message = "Specialty is required")
    @Column(nullable = false, length = 100)
    private String specialty;
}
