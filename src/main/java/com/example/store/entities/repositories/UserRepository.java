package com.example.store.entities.repositories;

import com.example.store.entities.User;
import org.springframework.data.repository.CrudRepository;


public abstract class UserRepository implements CrudRepository<User, Long> {
}
