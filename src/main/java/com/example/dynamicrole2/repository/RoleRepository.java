package com.example.dynamicrole2.repository;

import com.example.dynamicrole2.model.ERole;
import com.example.dynamicrole2.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);

    List<Role> findRolesByActionsId(Long actionId);
}
