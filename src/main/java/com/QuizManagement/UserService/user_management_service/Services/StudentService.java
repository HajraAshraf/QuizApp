package com.QuizManagement.UserService.user_management_service.Services;

import com.QuizManagement.UserService.user_management_service.Entities.Student;
import com.QuizManagement.UserService.user_management_service.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public void saveStudent(Student student){
        studentRepository.save(student);
    }
}
