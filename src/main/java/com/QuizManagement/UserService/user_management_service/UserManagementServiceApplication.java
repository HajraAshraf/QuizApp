package com.QuizManagement.UserService.user_management_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.QuizManagement.UserService.user_management_service.Entities")
@EnableJpaRepositories(basePackages = "com.QuizManagement.UserService.user_management_service.Repositories")
@ComponentScan(basePackages = "com.QuizManagement.UserService.user_management_service")
public class UserManagementServiceApplication {
	public static void main(String[] args) {
		//System.out.println("Hello");
		SpringApplication.run(UserManagementServiceApplication.class, args);
    }

}
