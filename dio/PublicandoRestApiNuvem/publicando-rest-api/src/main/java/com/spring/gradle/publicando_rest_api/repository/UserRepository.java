package com.spring.gradle.publicando_rest_api.repository;

import com.spring.gradle.publicando_rest_api.model.User;
//Tem bastante funções para interação com bd
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Incluir @Repository não é obrigatório, já que o JpaRepository já é um repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
