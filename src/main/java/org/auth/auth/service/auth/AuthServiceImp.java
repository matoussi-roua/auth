package org.auth.auth.service.auth;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.auth.auth.configuration.AuthenticationRole;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.auth.auth.model.auth.login.LoginDTO;
import org.auth.auth.model.auth.login.LoginResponseDTO;
import org.auth.auth.model.auth.register.RegisterDTO;
import org.auth.auth.model.auth.register.RegisterResponseDTO;
import org.auth.auth.model.user.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class AuthServiceImp implements AuthService {

    @Override
    public ResponseEntity<LoginResponseDTO> login(LoginDTO loginDTO) {

        return null;
    }

    @Override
    public ResponseEntity<RegisterResponseDTO> register(Authentication authetication, String role, RegisterDTO registerDTO) throws IllegalAccessException {
        if(authetication.getAuthorities() == null) {
            throw new IllegalAccessException("Unauthorized action");
        }
        return switch (role) {
            case AuthenticationRole.ROLE_ADMIN -> adminRegistration.register(registerDTO);
            default -> new ResponseEntity<>("Invalid role", HttpStatus.BAD_REQUEST);
        }
    }


}
