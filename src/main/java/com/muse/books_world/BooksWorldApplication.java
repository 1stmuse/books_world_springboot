package com.muse.books_world;

import com.muse.books_world.role.Role;
import com.muse.books_world.role.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BooksWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksWorldApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(
			RoleRepository roleRepository
	){
		return args -> {
			if(roleRepository.findByName("USER").isEmpty()){
				roleRepository.save(
						Role.builder()
								.name("USER").build()
				);
			}
		};
	}

}
