package org.auth.auth.model.token.refresh;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.auth.auth.model.token.Token;

@Table(name = "refresh_token")
@Entity

public class RefreshToken extends Token {
}
