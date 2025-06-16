package br.com.faculdade.jwt_cariton_project.controller;

import br.com.faculdade.jwt_cariton_project.dto.AuthResponseDto;
import br.com.faculdade.jwt_cariton_project.dto.LoginRequestDto;
import br.com.faculdade.jwt_cariton_project.dto.RegisterRequestDto;
import br.com.faculdade.jwt_cariton_project.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }





    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(@RequestBody LoginRequestDto request) {
        return ResponseEntity.ok(authService.login(request));
    }


    @PostMapping("/register")
    public ResponseEntity<AuthResponseDto> register(@RequestBody RegisterRequestDto request) {
        return ResponseEntity.ok(authService.register(request));
    }
}