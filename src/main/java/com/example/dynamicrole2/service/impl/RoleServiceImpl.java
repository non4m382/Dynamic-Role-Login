package com.example.dynamicrole2.service.impl;

import com.example.dynamicrole2.model.ERole;
import com.example.dynamicrole2.model.Role;
import com.example.dynamicrole2.repository.RoleRepository;
import com.example.dynamicrole2.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Optional<Role> findByName(ERole eRole) {
        return roleRepository.findByName(eRole);
    }

    @Override
    public List<Role> findByActionId(Long actionId) {
        return roleRepository.findRolesByActionsId(actionId);
    }
}
