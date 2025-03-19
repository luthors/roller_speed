package com.roller_speed.app.dashboard.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  // Usa una tabla única para la jerarquía
@DiscriminatorColumn(name = "user_type")  // Indica el tipo de usuario
@Table(name = "users")  // Esta es la única tabla de la jerarquía
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @Size(min = 3, max = 100, message = "First name must be between 3 and 100 characters")
    @Column(nullable = false, length = 100)
    private String firstName;

    
    @Size(min = 3, max = 100, message = "Last name must be between 3 and 100 characters")
    @Column(nullable = false, length = 100)
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email
    @Column(unique = true, nullable = false, length = 100)
    private String email;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "\\d{10}")
    @Column(nullable = false, length = 10)
    private String phone;

    @NotBlank(message = "Password is required")
    @Size(min = 6)
    @Column(nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;
}
