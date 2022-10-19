package com.example.dynamicrole2.service;

import com.example.dynamicrole2.model.ERole;
import com.example.dynamicrole2.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    public Optional<Role> findByName(ERole eRole);

    public List<Role> findByActionId(Long actionId);
}
