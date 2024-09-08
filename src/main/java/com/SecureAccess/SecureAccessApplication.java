package com.SecureAccess;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

import com.SecureAccess.Entities.Role;
import com.SecureAccess.Repositories.RoleRepo;

@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
//@EntityScan(basePackages = "com.SecureAccess.Entities")
public class SecureAccessApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureAccessApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner(RoleRepo roleRepository) {
		return args -> {
			if (roleRepository.findByName("USER").isEmpty()) {
				roleRepository.save(Role.builder().name("USER").build());
			}
		};
	}

}
