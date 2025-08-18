package com.quiz_service.user_service.service.serviceImpl;

import com.quiz_service.user_service.entity.User;
import com.quiz_service.user_service.form.UserForm;
import com.quiz_service.user_service.repository.UserRepository;
import com.quiz_service.user_service.exception.UserNotFoundException;
import com.quiz_service.user_service.response.APIResponse;
import com.quiz_service.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository userRepository;

    public APIResponse addUser(UserForm userForm) {

        User newUser = userForm.toUser(
                userForm.getUserType(),
                userForm.getUserName(),
                userForm.getUserEmail());

        if (userRepository.existsByUserEmail(newUser.getUserEmail())) {
            return APIResponse.builder()
                    .status(409)
                    .message("Email already exists")
                    .build();
        }
        userRepository.save(newUser);

        return APIResponse.builder()
                .status(200)
                .message("User added successfully")
                .build();
    }
    public APIResponse deleteUser(Integer userId) {
        if (!userRepository.existsByUserId(userId)) {
            throw new UserNotFoundException("User with Id " + userId + " does not exist");
        }
        userRepository.delete(userId);
        return APIResponse.builder().status(200).message("User deleted successfully").build();
    }
}
