package com.roller_speed.app.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roller_speed.app.dashboard.model.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
}