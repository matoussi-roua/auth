package org.auth.auth.model.token.confirmation;

import org.auth.auth.model.token.TokenGenerator;
import org.auth.auth.model.user.UserEntity;

public class ConfirmationTokenGenerator implements TokenGenerator {

    @Override
    public String generateToken(UserEntity user) {
        return "";
    }
}
