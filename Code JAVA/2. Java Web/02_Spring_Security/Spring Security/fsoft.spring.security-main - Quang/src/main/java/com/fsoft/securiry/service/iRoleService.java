package com.fsoft.securiry.service;

import com.fsoft.securiry.dto.Req.RoleCreationDTO;
import com.fsoft.securiry.dto.Res.RoleDTO;
import com.fsoft.securiry.exception.ServiceException;

import java.util.List;

public interface iRoleService {
    List<RoleDTO> getAll();

    RoleDTO add(RoleCreationDTO roleCreationDTO) throws ServiceException;

    RoleDTO edit(Long roleId, RoleCreationDTO roleCreationDTO) throws ServiceException;

    void delete(Long roleId) throws ServiceException;
}
