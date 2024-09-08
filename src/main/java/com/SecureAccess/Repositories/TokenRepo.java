package com.SecureAccess.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SecureAccess.Entities.Token;

public interface TokenRepo extends JpaRepository<Token, Integer> {
	Optional<Token> findByToken(String token);

}
