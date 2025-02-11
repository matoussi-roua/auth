package org.auth.auth.model.auth.login;


import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {
    @Pattern(
            regexp = "[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:[-]?[a-zA-Z0-9]+)*(?:\\.[a-zA-Z]{2,})+$",
            message = "Invalid email format"
    )
    private String username;
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
            message = "Passwords must be at least 8 characters long and include at least one uppercase letter, one lowercase letter, one digit, and one special character."
    )
    private String password;

}
