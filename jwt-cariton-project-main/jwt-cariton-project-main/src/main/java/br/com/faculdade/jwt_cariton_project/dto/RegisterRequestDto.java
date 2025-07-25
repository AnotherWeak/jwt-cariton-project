package br.com.faculdade.jwt_cariton_project.dto;

import br.com.faculdade.jwt_cariton_project.model.Role;


public class RegisterRequestDto {
    private String name;
    private String email;
    private String password;
    private Role role;


    public RegisterRequestDto() {
    }


    public RegisterRequestDto(String name, String email, String password, Role role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public Role getRole() { return role; }

    public void setRole(Role role) { this.role = role; }
}