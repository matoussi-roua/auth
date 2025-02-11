package org.auth.auth.model.token.access;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.auth.auth.model.token.Token;

@Table(name = "access_token")
@Entity
@Getter
@Setter
public class AccessToken extends Token {
    @Column(name = "access_token", unique = true, nullable = false)
    private String accessToken;

    public static AccessTokenBuilder builder() {
        return new AccessTokenBuilder();
    }
}
