package org.auth.auth.repository;

import org.auth.auth.model.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, UUID> {

    @Query(value = "SELECT U FROM UserEntity U WHERE U.id =: id")
    Optional<UserEntity> fetchUserById(@Param("id") final UUID id);

    @Query(value = "SELECT U FROM UserEntity U WHERE U.email =: email")
    Optional<UserEntity> fetchUserByEmail(@Param("email") final String email);

    @Query(value = "SELECT EXISTS(SELECT U FROM UserEntity U WHERE U.email =: email) ")
    Optional<Boolean> isEmailRegistered(@Param("email") final String email);

}

