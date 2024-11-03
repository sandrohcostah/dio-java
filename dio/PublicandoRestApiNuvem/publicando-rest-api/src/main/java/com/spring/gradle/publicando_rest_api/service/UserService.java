package com.spring.gradle.publicando_rest_api.service;

import com.spring.gradle.publicando_rest_api.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
