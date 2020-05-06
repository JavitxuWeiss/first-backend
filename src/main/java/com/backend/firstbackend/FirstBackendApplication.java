package com.backend.firstbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.backend.firstbackend.infrastructure")
@EntityScan("com.backend.firstbackend.domain")
@SpringBootApplication
public class FirstBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstBackendApplication.class, args);
	}

}
