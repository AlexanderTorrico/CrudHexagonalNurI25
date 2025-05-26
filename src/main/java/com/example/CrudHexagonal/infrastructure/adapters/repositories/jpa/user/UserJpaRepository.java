package com.example.CrudHexagonal.infrastructure.adapters.repositories.jpa.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
}
