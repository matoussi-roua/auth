package org.auth.auth.model.auth.login;

import lombok.Builder;
import lombok.Data;
import org.auth.auth.model.user.UserEntityDTO;

@Data
@Builder
public class LoginResponseDTO {
    private UserEntityDTO userEntityDTO;
}
