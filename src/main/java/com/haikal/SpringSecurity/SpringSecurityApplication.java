package com.haikal.SpringSecurity;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.haikal.SpringSecurity.Domain.Role;
import com.haikal.SpringSecurity.Domain.User;
import com.haikal.SpringSecurity.Service.UserService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		log.info("Run CommandLineRunner");
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null, "Haikal Hafiz", "haikal", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Akmal Afiq", "akmal", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Nurul Afiqah", "pikah", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Aiman Arif", "eman", "1234", new ArrayList<>()));

			userService.addRoletoUser("haikal", "ROLE_USER");
			userService.addRoletoUser("pikah", "ROLE_MANAGER");
			userService.addRoletoUser("haikal", "ROLE_ADMIN");
			userService.addRoletoUser("haikal", "ROLE_SUPER_ADMIN");
			userService.addRoletoUser("akmal", "ROLE_SUPER_ADMIN");
			userService.addRoletoUser("eman", "ROLE_ADMIN");
		};

	}

}
