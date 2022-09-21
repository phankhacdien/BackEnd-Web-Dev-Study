package com.fsoft.securiry.dto.Res;

import java.util.HashSet;
import java.util.Set;

public class AppUserDTO {
    private Long id;
    private String name;
    private String username;
    private String password;
    private Set<RoleDTO> roles = new HashSet<>();

    public AppUserDTO() {
    }

    public AppUserDTO(Long id, String name, String username, String password, Set<RoleDTO> roles) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleDTO> roles) {
        this.roles = roles;
    }
}
