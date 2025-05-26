package com.example.premierleagueapp.service;

import org.springframework.stereotype.Service;

import com.example.premierleagueapp.model.Role;
import com.example.premierleagueapp.repository.RoleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Optional<Role> getRoleById(Long roleId) {
        return roleRepository.findById(roleId);
    }

    public Optional<Role> getRoleByName(String roleName) {
        return roleRepository.findByName(roleName);
    }

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

}
