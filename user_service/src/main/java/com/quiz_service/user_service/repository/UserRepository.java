package com.quiz_service.user_service.repository;


import com.quiz_service.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>
{
    boolean existsByUserId(Integer userId);

    boolean existsByUserEmail(String userEmail);

    void delete(int userId);
}

