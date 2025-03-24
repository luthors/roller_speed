package com.roller_speed.app.dashboard.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private LocalDate paymentDate;

    
    @Column( length = 50)
    private String paymentMethod;  // Example: Credit Card, Bank Transfer

        
    
    private Double amount;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}