package com.quiz_service.user_service.controller;


import com.quiz_service.user_service.form.UserForm;
import com.quiz_service.user_service.response.APIResponse;
import com.quiz_service.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/user-service")
@RestController
public class UserController
{
    @Autowired
    UserService userService;

    @PostMapping("/add-user")
    public APIResponse addUser(@RequestBody UserForm userForm){

        return userService.addUser(userForm);
    }
    @DeleteMapping("/delete-user")
    public APIResponse deleteUser(@RequestParam Integer userId){

        return userService.deleteUser(userId);
    }

}
