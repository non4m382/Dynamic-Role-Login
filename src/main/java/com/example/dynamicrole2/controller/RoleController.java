package com.example.dynamicrole2.controller;

import com.example.dynamicrole2.service.impl.RoleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/role")
public class RoleController {

    private final RoleServiceImpl roleService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> getRoleByActionId(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(roleService.findByActionId(id));
    }

}
