package org.auth.auth.model.token.access;

import org.auth.auth.model.token.TokenGenerator;
import org.auth.auth.model.user.UserEntity;

public class AccessTokenGenerator implements TokenGenerator {

    @Override
    public String generateToken(UserEntity user) {
        return "";
    }
}
