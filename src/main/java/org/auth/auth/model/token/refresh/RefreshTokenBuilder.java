package org.auth.auth.model.token.refresh;


public class RefreshTokenBuilder {
    private Long id;
    private String refreshToken;
    private Boolean revoked;
    private Boolean expired;

    public RefreshTokenBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public RefreshTokenBuilder refreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    public RefreshTokenBuilder revoked(Boolean revoked) {
        this.revoked = revoked;
        return this;
    }

    public RefreshTokenBuilder expired(Boolean expired) {
        this.expired = expired;
        return this;
    }

    public RefreshToken build() {
        RefreshToken newrefreshToken = new RefreshToken();
        newrefreshToken.setId(id);
        newrefreshToken.setRefreshToken(refreshToken);
        newrefreshToken.setRevoked(revoked);
        newrefreshToken.setExpired(expired);
        return newrefreshToken;
    }
}
