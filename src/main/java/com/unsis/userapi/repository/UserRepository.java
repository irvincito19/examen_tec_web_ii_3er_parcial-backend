package com.unsis.userapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unsis.userapi.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
