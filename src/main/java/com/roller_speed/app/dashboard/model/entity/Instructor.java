package com.roller_speed.app.dashboard.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
//@DiscriminatorValue("INSTRUCTOR")  // Define el tipo en la columna 'user_type'

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Instructor extends User {

    
    private int yearsExperience;

    
    
    private String specialty;
}
