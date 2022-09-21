package com.fsoft.securiry.controller;

import com.fsoft.securiry.dto.Req.AppUserCreationDTO;
import com.fsoft.securiry.dto.Res.AppUserDTO;
import com.fsoft.securiry.service.iAppUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class AppUserController {
    private iAppUserService appUserService;

    public AppUserController(iAppUserService appUserService) {
        this.appUserService = appUserService;
    }

    //anyone can have access to this API
    @GetMapping
    public ResponseEntity<List<AppUserDTO>> getAll() {
        return new ResponseEntity<>(appUserService.getAll(), HttpStatus.OK);
    }

    //only for USER and ADMIN
    @PutMapping("/edit/{userId}")
    public ResponseEntity<AppUserDTO> edit(
            @PathVariable Long userId,
            @RequestBody AppUserCreationDTO appUserCreationDTO
    ) {
        return new ResponseEntity<>(appUserService.edit(userId, appUserCreationDTO),
                HttpStatus.ACCEPTED);
    }

    //only for USER and ADMIN
    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable Long userId) {
        appUserService.delete(userId);
    }
}
