package com.quiz_service.user_service.service;

import com.quiz_service.user_service.form.UserForm;
import com.quiz_service.user_service.response.APIResponse;

public interface UserService
{
    APIResponse addUser(UserForm userForm);
    APIResponse deleteUser(Integer userId);
}
