package com.roller_speed.app.dashboard.service;

import java.util.List;
import java.util.Optional;

import com.roller_speed.app.dashboard.model.entity.Role;


public interface IRoleService {
    List<Role> getAllRoles();
    Optional<Role> getRoleById(Long id);
    Role saveRole(Role role);
    void deleteRole(Long id);
}
