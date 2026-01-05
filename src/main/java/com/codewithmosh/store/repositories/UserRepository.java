package com.codewithmosh.store.repositories;

import com.codewithmosh.store.entities.User;

public interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<User, Long> {
}
