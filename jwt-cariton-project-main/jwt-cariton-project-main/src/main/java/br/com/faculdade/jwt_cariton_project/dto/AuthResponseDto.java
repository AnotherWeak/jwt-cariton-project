package br.com.faculdade.jwt_cariton_project.dto;


public class AuthResponseDto {
    private String token;



    public AuthResponseDto(String token) {
        this.token = token;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}