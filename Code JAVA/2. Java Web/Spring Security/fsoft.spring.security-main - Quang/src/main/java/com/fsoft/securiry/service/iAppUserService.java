package com.fsoft.securiry.service;

import com.fsoft.securiry.dto.Req.AppUserCreationDTO;
import com.fsoft.securiry.dto.Res.AppUserDTO;
//import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface iAppUserService  {
    List<AppUserDTO> getAll();

    AppUserDTO add(AppUserCreationDTO appUserCreationDTO);

    AppUserDTO edit(Long userId, AppUserCreationDTO appUserCreationDTO);

    void delete(Long userId);
}
