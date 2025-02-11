package org.auth.auth.model.auth.register;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterDTO {
    private String firstName;
    private String lastName;
    @Pattern(
            regexp = "[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:[-]?[a-zA-Z0-9]+)*(?:\\.[a-zA-Z]{2,})+$",
            message = "Invalid email format"
    )
    private String email;
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
            message = "Passwords must be at least 8 characters long and include at least one uppercase letter, one lowercase letter, one digit, and one special character."
    )
    private String password;

}
