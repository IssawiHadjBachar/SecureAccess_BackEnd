package com.SecureAccess.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SecureAccess.Entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {
	Optional<Role> findByName(String role);

}
