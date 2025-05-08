package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public Flux<User> getAllUsers() {
        return repository.findAll();
    }

    public Mono<User> saveUser(User user) {
        return repository.save(user);
    }

    public Mono<Void> deleteUser(String id) {
        return repository.deleteById(id);
    }
}
