package com.fsoft.securiry.dto.Req;

public class RoleCreationDTO {
    private String roleName;

    public RoleCreationDTO() {
    }

    public RoleCreationDTO(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
