package org.auth.auth.service.user;

import org.auth.auth.model.user.UserEntity;
import org.auth.auth.model.user.UserEntityDTO;

import java.util.UUID;

public interface UserEntityService {

    UserEntity save(UserEntity user);
    UserEntity saveAndFlush(UserEntity user);
    UserEntity createUser(UserEntity user);

    UserEntityDTO mapToDTO(UserEntity user);
    UserEntityDTO getUserById(UUID id);
    UserEntityDTO getUserByeEmail(String email);



}
