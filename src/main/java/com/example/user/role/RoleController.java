package com.example.user.role;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@RequiredArgsConstructor
public class RoleController {
    private final RoleEntityRepository repository;

    @PostMapping("/v1")
    public Role create(@RequestBody Role role) {
        return repository.save(role);
    }
}
