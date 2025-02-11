package org.auth.auth.model.user;

import org.auth.auth.model.role.Role;

import java.time.LocalDateTime;
import java.util.UUID;

public interface UserEntityDTO {
    UUID getId();
    String getFirstName();
    String getLastName();
    String getEmail();
    LocalDateTime getCreatedAt();
    LocalDateTime getUpdatedAt();
    Boolean isEnabled();
    Role getRole();



}
