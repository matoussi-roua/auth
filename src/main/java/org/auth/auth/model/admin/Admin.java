package org.auth.auth.model.admin;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.auth.auth.model.user.UserEntity;

@AllArgsConstructor
@Table(name = "admin")
@Entity
@Getter
@Setter
@ToString
@DiscriminatorValue("ADMIN")

public class Admin extends UserEntity {
    public static AdminBuilder builder() {
        return new AdminBuilder();
    }

}
