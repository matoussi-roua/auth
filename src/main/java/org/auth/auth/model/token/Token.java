package org.auth.auth.model.token;

import jakarta.persistence.*;
import lombok.*;
import org.auth.auth.model.user.UserEntity;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @Column(name = "revoked")
    protected Boolean revoked;
    @Column(name = "expired")
    protected Boolean expired;

    @ManyToOne
    @JoinColumn(name = "token_user_id")
    protected UserEntity userToken;
}
