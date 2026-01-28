package com.codewithmosh.store.repositories;

import java.util.Optional;

import com.codewithmosh.store.entities.User;

public interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);
}
