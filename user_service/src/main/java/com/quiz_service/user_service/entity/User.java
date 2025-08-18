package com.quiz_service.user_service.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Table(name="user")
@Builder(toBuilder=true)
@NoArgsConstructor
@Entity
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class User
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId;

    @Column(name="user_type")
    private String userType;

    @Column(name="user_name")
    private String userName;

    @Column(name="user_email")
    private String userEmail;

    private List<String> roles;

    public User(String userType, String userName, String userEmail){
        this.userType=userType;
        this.userName=userName;
        this.userEmail=userEmail;
    }
}
