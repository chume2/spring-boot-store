package com.codewithmosh.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codewithmosh.store.users.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
}