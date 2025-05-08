package com.example.demo.repository;

import com.example.demo.model.User;
import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;

public interface UserRepository extends FirestoreReactiveRepository<User> {}
