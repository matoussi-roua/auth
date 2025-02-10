package org.auth.auth.model.admin;

import jakarta.persistence.Column;
import org.auth.auth.model.role.Role;

import java.time.LocalDateTime;
import java.util.UUID;

public class AdminBuilder {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean enabled;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private Role role;

    public AdminBuilder id(UUID id) {
        this.id = id;
        return this;
    }

    public AdminBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public AdminBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public AdminBuilder email(String email) {
        this.email = email;
        return this;
    }
    public AdminBuilder password(String password) {
        this.password = password;
        return this;
    }
    public AdminBuilder enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public AdminBuilder createdAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public AdminBuilder updatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public AdminBuilder accountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
        return this;
    }
    public AdminBuilder accountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
        return this;
    }

    public AdminBuilder credentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
        return this;
    }

    public AdminBuilder role(Role role) {
        this.role = role;
        return this;
    }
    public Admin build() {
        Admin admin = new Admin();
        admin.setId(id);
        admin.setFirstName(firstName);
        admin.setLastName(lastName);
        admin.setEmail(email);
        admin.setPassword(password);
        admin.setEnabled(enabled);
        admin.setCreatedAt(createdAt);
        admin.setUpdatedAt(updatedAt);
        admin.setAccountNonExpired(accountNonExpired);
        admin.setAccountNonLocked(accountNonLocked);
        admin.setCredentialsNonExpired(credentialsNonExpired);
        admin.setRole(role);
        return admin;
    }
}
