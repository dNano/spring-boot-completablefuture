package com.humansreadcode.example.service;

import com.humansreadcode.example.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface UserService {

    CompletableFuture<Page<User>> findAll(final Pageable pageable);

    CompletableFuture<Optional<User>> findOneById(final String id);
}
