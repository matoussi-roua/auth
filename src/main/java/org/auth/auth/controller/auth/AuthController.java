package org.auth.auth.controller.auth;

import lombok.RequiredArgsConstructor;
import org.auth.auth.model.auth.login.LoginDTO;
import org.auth.auth.model.auth.login.LoginResponseDTO;
import org.auth.auth.model.auth.register.RegisterDTO;
import org.auth.auth.model.auth.register.RegisterResponseDTO;
import org.auth.auth.service.auth.AuthServiceImp;
import org.hibernate.annotations.Parameter;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthServiceImp authServiceImp;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponseDTO> register(
            Authentication authentication,
            @RequestParam String role,
            @RequestBody RegisterDTO registerDTO
    ) throws IllegalAccessException {
        return authServiceImp.register(authentication, role, registerDTO);
    }

    @GetMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginDTO loginDTO) {
        return authServiceImp.login(loginDTO);
    }

}
