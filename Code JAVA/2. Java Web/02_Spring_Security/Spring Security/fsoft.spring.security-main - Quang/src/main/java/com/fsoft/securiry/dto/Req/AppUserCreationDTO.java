package com.fsoft.securiry.dto.Req;

import java.util.HashSet;
import java.util.Set;

public class AppUserCreationDTO {
    private String name;
    private String username;
    private String password;
    private Set<Long> roleId = new HashSet<>();

    public AppUserCreationDTO() {
    }

    public AppUserCreationDTO(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
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

    public Set<Long> getRoleId() {
        return roleId;
    }

    public void setRoleId(Set<Long> roleId) {
        this.roleId = roleId;
    }
}
