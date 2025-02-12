package org.auth.auth.model.token;

import org.auth.auth.model.user.UserEntity;

public interface TokenGenerator {
    String generateToken(UserEntity user);
}
