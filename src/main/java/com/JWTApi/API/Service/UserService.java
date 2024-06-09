package com.JWTApi.API.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.JWTApi.API.Entity.User;
import com.JWTApi.API.Repo.UserRepo;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepository;

    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }
}
