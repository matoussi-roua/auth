package org.auth.auth.model.token.confirmation;

import jakarta.persistence.Column;

public class ConfirmationTokenBuilder {

    private Long id;
    private String confirmationToken;
    private Boolean revoked;
    private Boolean expired;

    public ConfirmationTokenBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public ConfirmationTokenBuilder confirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
        return this;
    }

    public ConfirmationTokenBuilder revoked(Boolean revoked) {
        this.revoked = revoked;
        return this;
    }

    public ConfirmationTokenBuilder expired(Boolean expired) {
        this.expired = expired;
        return this;
    }

    public ConfirmationToken build() {
        ConfirmationToken newconfirmationToken = new ConfirmationToken();
        newconfirmationToken.setId(id);
        newconfirmationToken.setConfirmationToken(confirmationToken);
        newconfirmationToken.setRevoked(revoked);
        newconfirmationToken.setExpired(expired);
        return newconfirmationToken;
    }

}

