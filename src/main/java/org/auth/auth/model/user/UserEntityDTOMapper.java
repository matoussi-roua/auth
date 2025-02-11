package org.auth.auth.model.user;

import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserEntityDTOMapper implements Function<UserEntity, UserEntityDTOImp> {
    @Override
    public UserEntityDTOImp apply(UserEntity userEntity) {
        return new UserEntityDTOImp(
                userEntity.getId(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getEmail(),
                userEntity.isEnabled(),
                userEntity.getCreatedAt(),
                userEntity.getUpdatedAt(),
                userEntity.getRole());
    }
}
