package com.fsoft.securiry.dto.mapper;

import com.fsoft.securiry.dto.Req.RoleCreationDTO;
import com.fsoft.securiry.dto.Res.RoleDTO;
import com.fsoft.securiry.entity.Role;

public class RoleMapper {
    private static RoleMapper INSTANCE;

    public static RoleMapper getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RoleMapper();
        }
        return INSTANCE;
    }

    public Role toEntity(RoleCreationDTO roleCreationDTO) {
        Role role = new Role();
        role.setRoleName(roleCreationDTO.getRoleName());
        return role;
    }

    public RoleDTO toDTO(Role role) {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setId(role.getId());
        roleDTO.setRoleName(role.getRoleName());
        return roleDTO;
    }
}
