package com.QuizManagement.UserService.user_management_service.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.QuizManagement.UserService.user_management_service.Entities.Student;
import com.QuizManagement.UserService.user_management_service.Services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class RegistrationController {
    @Autowired
  private StudentService studentService;
    @GetMapping("/regPage")
    public String openRegPage(Model model) {
        model.addAttribute("student",new Student());
        return "register";
    }

    @PostMapping("/submit")
    public String registerStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "register";
    }

}
