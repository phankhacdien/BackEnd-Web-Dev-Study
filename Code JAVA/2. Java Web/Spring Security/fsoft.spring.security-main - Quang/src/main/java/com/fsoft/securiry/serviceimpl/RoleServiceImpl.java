package com.fsoft.securiry.serviceimpl;

import com.fsoft.securiry.dto.Req.RoleCreationDTO;
import com.fsoft.securiry.dto.Res.RoleDTO;
import com.fsoft.securiry.dto.mapper.RoleMapper;
import com.fsoft.securiry.entity.Role;
import com.fsoft.securiry.exception.ServiceException;
import com.fsoft.securiry.repository.iRoleRepository;
import com.fsoft.securiry.service.iRoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements iRoleService {
    private iRoleRepository roleRepository;

    public RoleServiceImpl(iRoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleDTO> getAll() {
        return roleRepository.findAll().stream()
                .map(role -> RoleMapper.getInstance().toDTO(role))
                .collect(Collectors.toList());
    }

    @Override
    public RoleDTO add(RoleCreationDTO roleCreationDTO) throws ServiceException {
        Role role = roleRepository.findByRoleName(roleCreationDTO.getRoleName());
        System.out.println(role.getRoleName());
        //check if role has already existed
        if (role != null) {
            throw new ServiceException("Error! The role has already existed");
        }
        Role roleToAdd = RoleMapper.getInstance().toEntity(roleCreationDTO);
        return RoleMapper.getInstance().toDTO(roleRepository.save(roleToAdd));
    }

    @Override
    public RoleDTO edit(Long roleId, RoleCreationDTO roleCreationDTO) throws ServiceException {
        //check if the role exists in DB
        Role role = roleRepository.findById(roleId)
                .orElseThrow(() -> new ServiceException("Error! No role with the given ID was found"));
        role.setRoleName(roleCreationDTO.getRoleName());
        return RoleMapper.getInstance().toDTO(role);
    }

    @Override
    public void delete(Long roleId) throws ServiceException {
        //check if the role exists in DB
        Role role = roleRepository.findById(roleId)
                .orElseThrow(() -> new ServiceException("Error! No role with the given ID was found"));
        roleRepository.delete(role);
    }
}
