package com.quiz_service.user_service.form;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.quiz_service.user_service.entity.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserForm
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer userId;

    private String userName;

    private String userType;

    private String userEmail;

    public User toUser(String userType, String userName, String userEmail) {
        return new User(userType, userName, userEmail);
    }

//    public User(){
//
//    }
}
