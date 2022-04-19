package com.fsoft.securiry.repository;

import com.fsoft.securiry.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iRoleRepository extends JpaRepository<Role, Long> {
    Role findByRoleName(String roleName);
}
