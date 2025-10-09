package com.example.store.entities.repositories;

import com.example.store.entities.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}