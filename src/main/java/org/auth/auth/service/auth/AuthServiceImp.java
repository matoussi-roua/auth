package org.auth.auth.service.auth;

import org.auth.auth.model.auth.login.LoginDTO;
import org.auth.auth.model.auth.login.LoginResponseDTO;
import org.auth.auth.model.auth.register.RegisterDTO;
import org.auth.auth.model.auth.register.RegisterResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImp implements AuthService{

    @Override
    public ResponseEntity<LoginResponseDTO> login(LoginDTO loginDTO) {
        return null;
    }

    @Override
    public ResponseEntity<RegisterResponseDTO> register(RegisterDTO registerDTO) {
        return null;
    }
}
