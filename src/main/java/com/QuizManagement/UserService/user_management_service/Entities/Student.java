package com.QuizManagement.UserService.user_management_service.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long SID;
    @Column
    private String Name;
    @Column
    private String Password;
    @Column
    private String Email;

    public Student() {
    }

    public Student(long SID, String name, String password, String email) {
        this.SID = SID;
        Name = name;
        Password = password;
        Email = email;
    }

    public long getSID() {
        return SID;
    }

    public void setSID(long SID) {
        this.SID = SID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "SID=" + SID +
                ", Name='" + Name + '\'' +
                ", Password='" + Password + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
