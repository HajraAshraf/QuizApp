package com.QuizManagement.UserService.user_management_service.Repositories;

import com.QuizManagement.UserService.user_management_service.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
