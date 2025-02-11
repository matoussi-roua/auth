package org.auth.auth.model.token.confirmation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.auth.auth.model.token.Token;
@Table(name = "confirmation_token")
@Entity
@Getter
@Setter
public class ConfirmationToken extends Token {
    @Column(name = "confirmation_token", unique = true, nullable = false)
    private String confirmationToken;

    public static ConfirmationTokenBuilder builder() {
        return new ConfirmationTokenBuilder();
    }
}
