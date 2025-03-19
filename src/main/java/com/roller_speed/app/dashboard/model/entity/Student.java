package com.roller_speed.app.dashboard.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@DiscriminatorValue("STUDENT")  // Define el tipo en la columna 'user_type'
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student extends User {

    @NotNull(message = "Birthdate is required")
    @Column(nullable = false)
    private String birthDate;

    @NotBlank(message = "Gender is required")
    @Column(nullable = false, length = 10)
    private String gender;

    @Column(nullable = false)
    private boolean active = true;
}