package org.auth.auth.model.token.confirmation;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.auth.auth.model.token.Token;
@Table(name = "confirmation_token")
@Entity
public class ConfirmationToken extends Token {

}
