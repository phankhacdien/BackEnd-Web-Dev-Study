package com.fsoft.securiry.serviceimpl;

import com.fsoft.securiry.dto.Req.AppUserCreationDTO;
import com.fsoft.securiry.dto.Res.AppUserDTO;
import com.fsoft.securiry.dto.mapper.AppUserMapper;
import com.fsoft.securiry.entity.AppUser;
import com.fsoft.securiry.entity.Role;
import com.fsoft.securiry.repository.iAppUserRepository;
import com.fsoft.securiry.repository.iRoleRepository;
import com.fsoft.securiry.service.iAppUserService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AppUserServiceImpl implements iAppUserService {
    private iAppUserRepository appUserRepository;
    private iRoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;


    public AppUserServiceImpl(iAppUserRepository appUserRepository,
                              iRoleRepository roleRepository,
                              PasswordEncoder passwordEncoder) {
        this.appUserRepository = appUserRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public List<AppUserDTO> getAll() {
        return appUserRepository.findAll().stream()
                .map(appUser -> AppUserMapper.getInstance().toDTO(appUser))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public AppUserDTO add(AppUserCreationDTO appUserCreationDTO) {
        AppUser appUser = AppUserMapper.getInstance().toEntity(appUserCreationDTO);
        Set<Role> roles = new HashSet<>();
        for (Long roleId : appUserCreationDTO.getRoleId()) {
            Role role = roleRepository.findById(roleId)
                    .orElseThrow(() -> new ServiceException("Error! No role with the given ID was found"));
            roles.add(role);
        }
        appUser.setPassword(passwordEncoder.encode(appUserCreationDTO.getPassword()));
        appUser.setRoles(roles);
        return AppUserMapper.getInstance().toDTO(appUserRepository.save(appUser));

    }

    @Override
    @Transactional
    public AppUserDTO edit(Long userId, AppUserCreationDTO appUserCreationDTO) {
        AppUser appUserToEdit = appUserRepository.findById(userId)
                .orElseThrow(() -> new ServiceException("Error! No user with the given ID was found"));
        appUserToEdit.setUsername(appUserCreationDTO.getUsername());
        appUserToEdit.setPassword(passwordEncoder.encode(appUserCreationDTO.getPassword()));
        Set<Role> roles = new HashSet<>();
        for (Long roleId : appUserCreationDTO.getRoleId()) {
            Role role = roleRepository.findById(roleId)
                    .orElseThrow(() -> new ServiceException("Error! No role with the given ID was found"));
            roles.add(role);
        }
        appUserToEdit.setRoles(roles);
        return AppUserMapper.getInstance().toDTO(appUserRepository.save(appUserToEdit));
    }

    @Override
    @Transactional
    public void delete(Long userId) {
        AppUser appUserToDelete = appUserRepository.findById(userId)
                .orElseThrow(() -> new ServiceException("Error! No user with the given ID was found"));
        appUserRepository.delete(appUserToDelete);
    }


}
