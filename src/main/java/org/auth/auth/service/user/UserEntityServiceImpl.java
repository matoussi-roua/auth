package org.auth.auth.service.user;

import org.auth.auth.model.admin.Admin;
import org.auth.auth.model.admin.AdminDTOMapper;
import org.auth.auth.model.user.UserEntity;
import org.auth.auth.model.user.UserEntityDTO;
import org.auth.auth.model.user.UserEntityDTOImp;
import org.auth.auth.model.user.UserEntityDTOMapper;
import org.auth.auth.repository.UserEntityRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserEntityServiceImpl implements UserEntityService {
    private final UserEntityRepository userEntityRepository;
    private final UserEntityDTOMapper userEntityDTOMapper;
    private final AdminDTOMapper adminDTOMapper;

    public UserEntityServiceImpl(UserEntityRepository userEntityRepository, UserEntityDTOMapper userEntityDTOMapper, AdminDTOMapper adminDTOMapper) {
        this.userEntityRepository = userEntityRepository;
        this.userEntityDTOMapper = userEntityDTOMapper;
        this.adminDTOMapper = adminDTOMapper;
    }

    @Override
    public UserEntity save(UserEntity user) {
        try {
            return userEntityRepository.save(user);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public UserEntity saveAndFlush(UserEntity user) {
        try {
            return userEntityRepository.saveAndFlush(user);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public UserEntity createUser(UserEntity user) {
        return null;
    }

    @Override
    public UserEntityDTO mapToDTO(UserEntity userEntity) {
        return switch (userEntity.getClass().getSimpleName()) {
            case "Admin" -> adminDTOMapper.apply((Admin) userEntity);
            default -> userEntityDTOMapper.apply(userEntity);
        };
    }

    @Override
    public UserEntityDTO getUserById(UUID id) {
        UserEntity user = userEntityRepository.fetchUserById(id).orElseThrow(() -> new RuntimeException());
        return userEntityDTOMapper.apply(user);
    }

    @Override
    public UserEntityDTO getUserByeEmail(String email) {
        return userEntityDTOMapper.apply(userEntityRepository.fetchUserByEmail(email).orElseThrow(() -> new RuntimeException()));
    }
}
