package com.roller_speed.app.dashboard.model.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
//@DiscriminatorValue("STUDENT")  // Define el tipo en la columna 'user_type'
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student extends User {

    
    private String birthDate;

    
    @Column(length = 10)
    private String gender;

    @ManyToMany(mappedBy = "students", fetch = FetchType.EAGER)
    private List<Class> classes;
}