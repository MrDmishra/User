package com.JWTApi.API.Repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.JWTApi.API.Entity.User;

public interface UserRepo extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
