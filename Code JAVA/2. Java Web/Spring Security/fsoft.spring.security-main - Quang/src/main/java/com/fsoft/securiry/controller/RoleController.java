package com.fsoft.securiry.controller;

import com.fsoft.securiry.dto.Req.RoleCreationDTO;
import com.fsoft.securiry.dto.Res.RoleDTO;
import com.fsoft.securiry.exception.ServiceException;
import com.fsoft.securiry.service.iRoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/roles")
public class RoleController {
    private iRoleService roleService;

    public RoleController(iRoleService roleService) {
        this.roleService = roleService;
    }

    //anyone can have access to this API
    @GetMapping
    public ResponseEntity<List<RoleDTO>> getAll() {
        return new ResponseEntity<>(roleService.getAll(), HttpStatus.OK);
    }

    //only for ADMIN
    @PostMapping
    public ResponseEntity<RoleDTO> add(@RequestBody RoleCreationDTO roleCreationDTO) throws ServiceException {
        return new ResponseEntity<>(roleService.add(roleCreationDTO), HttpStatus.CREATED);
    }

    //only for ADMIN
    @PutMapping("/edit/{roleId}")
    public ResponseEntity<RoleDTO> edit(@PathVariable Long roleId,
                                        @RequestBody RoleCreationDTO roleCreationDTO) throws ServiceException {
        return new ResponseEntity<>(roleService.edit(roleId, roleCreationDTO), HttpStatus.ACCEPTED);
    }

    //only for ADMIN
    @DeleteMapping("/delete/{roleId}")
    public void delete(@PathVariable Long roleId) throws ServiceException {
        roleService.delete(roleId);
    }
}
