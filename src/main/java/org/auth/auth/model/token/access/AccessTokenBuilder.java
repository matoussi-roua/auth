package org.auth.auth.model.token.access;

import jakarta.persistence.Column;

public class AccessTokenBuilder {
    private Long id;
    private String accessToken;
    private Boolean revoked;
    private Boolean expired;

    public AccessTokenBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public AccessTokenBuilder accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public AccessTokenBuilder revoked(Boolean revoked) {
        this.revoked = revoked;
        return this;
    }

    public AccessTokenBuilder expired(Boolean expired) {
        this.expired = expired;
        return this;
    }

    public AccessToken build() {
        AccessToken newAccessToken = new AccessToken();
        newAccessToken.setId(id);
        newAccessToken.setAccessToken(accessToken);
        newAccessToken.setRevoked(revoked);
        newAccessToken.setExpired(expired);
        return newAccessToken;
    }
}


