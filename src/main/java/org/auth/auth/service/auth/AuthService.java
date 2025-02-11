package org.auth.auth.service.auth;

import org.auth.auth.model.auth.login.LoginDTO;
import org.auth.auth.model.auth.login.LoginResponseDTO;
import org.auth.auth.model.auth.register.RegisterDTO;
import org.auth.auth.model.auth.register.RegisterResponseDTO;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<LoginResponseDTO> login(LoginDTO loginDTO);
    ResponseEntity<RegisterResponseDTO> register(RegisterDTO registerDTO);
}
