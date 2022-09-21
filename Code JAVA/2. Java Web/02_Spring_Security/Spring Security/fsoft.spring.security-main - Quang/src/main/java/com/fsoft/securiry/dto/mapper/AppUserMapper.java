package com.fsoft.securiry.dto.mapper;

import com.fsoft.securiry.dto.Req.AppUserCreationDTO;
import com.fsoft.securiry.dto.Res.AppUserDTO;
import com.fsoft.securiry.dto.Res.RoleDTO;
import com.fsoft.securiry.entity.AppUser;

import java.util.Set;
import java.util.stream.Collectors;

public class AppUserMapper {
    private static AppUserMapper INSTANCE;

    public static AppUserMapper getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AppUserMapper();
        }
        return INSTANCE;
    }

    public AppUser toEntity(AppUserCreationDTO appUserDTO) {
        AppUser appUser = new AppUser();
        appUser.setName(appUserDTO.getName());
        appUser.setUsername(appUserDTO.getUsername());
        appUser.setPassword(appUserDTO.getPassword());
        return appUser;
    }

    public AppUserDTO toDTO(AppUser appUser) {
        AppUserDTO appUserDTO = new AppUserDTO();
        appUserDTO.setId(appUser.getId());
        appUserDTO.setName(appUser.getName());
        appUserDTO.setUsername(appUser.getUsername());
        appUserDTO.setPassword(appUser.getPassword());
        Set<RoleDTO> roles = appUser.getRoles().stream()
                .map(role -> RoleMapper.getInstance().toDTO(role))
                .collect(Collectors.toSet());
        appUserDTO.setRoles(roles);
        return appUserDTO;
    }

}
