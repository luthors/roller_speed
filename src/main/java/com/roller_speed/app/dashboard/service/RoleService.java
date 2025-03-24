package com.roller_speed.app.dashboard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roller_speed.app.dashboard.model.entity.Role;
import com.roller_speed.app.dashboard.repository.RoleRepository;


@Service
public class RoleService implements IRoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllRoles'");
        
        
        
    }

    @Override
    public Optional<Role> getRoleById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRoleById'");
    }

    @Override
    public Role saveRole(Role role) {
        
        return roleRepository.save(role);

    }

    @Override
    public void deleteRole(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteRole'");
    }

}   