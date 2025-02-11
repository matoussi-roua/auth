package org.auth.auth.model.token.refresh;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.auth.auth.model.token.Token;

@Table(name = "refresh_token")
@Entity
@Getter
@Setter

public class RefreshToken extends Token {
    @Column(name = "refresh_token", unique = true, nullable = false)
    private String refreshToken;

    public static RefreshTokenBuilder builder() {
        return new RefreshTokenBuilder();
    }
}
