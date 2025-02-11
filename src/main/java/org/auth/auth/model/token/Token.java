package org.auth.auth.model.token;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "token", unique = true, nullable = false)
    private String token;
    @Column(name = "revoked")
    private Boolean revoked;
    @Column(name = "expired")
    private Boolean expired;

}
