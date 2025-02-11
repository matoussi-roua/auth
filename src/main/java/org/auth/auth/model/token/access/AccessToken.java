package org.auth.auth.model.token.access;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.auth.auth.model.token.Token;

@Table(name = "access_token")
@Entity

public class AccessToken extends Token {

}
