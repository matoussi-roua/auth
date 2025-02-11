package org.auth.auth.model.admin;

import org.auth.auth.model.role.Role;
import org.auth.auth.model.user.UserEntityDTO;

import java.time.LocalDateTime;
import java.util.UUID;

public record AdminDTOImp(UUID id, String firstName, String lastName, String email, LocalDateTime createdAt,
                          LocalDateTime updatedAt, Boolean enabled, Role role) implements UserEntityDTO {

    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public Boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public Role getRole() {
        return this.role;
    }
}
