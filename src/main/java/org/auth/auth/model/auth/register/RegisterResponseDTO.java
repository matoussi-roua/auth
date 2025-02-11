package org.auth.auth.model.auth.register;

import lombok.Getter;
import lombok.Setter;
import org.auth.auth.model.user.UserEntityDTO;

@Getter
@Setter
public class RegisterResponseDTO {
    private UserEntityDTO userEntityDTO;
}
