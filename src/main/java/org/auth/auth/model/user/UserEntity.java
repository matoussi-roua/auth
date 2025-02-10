package org.auth.auth.model.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.auth.auth.model.role.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.UUID;
@Getter
@Setter
@ToString
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "user_type")
public abstract class UserEntity implements UserDetails {

    @GeneratedValue
    @Column(name = "id" , nullable = false , unique = true)
    @Id
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email" , nullable = false , unique = true)
    private String email;

    @Column(name = "password" , nullable = false )
    private String password;

    @Column(name = "is_enabled")
    private boolean enabled;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "is_account_expired")
    private boolean accountNonExpired;

    @Column(name = "is_account_locked")
    private boolean accountNonLocked;

    @Column(name = "is credential_expired")
    private boolean credentialsNonExpired;

    @ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private Role role;

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }
    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }
    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public String getUsername() {
        return email;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return null;
    }


}
