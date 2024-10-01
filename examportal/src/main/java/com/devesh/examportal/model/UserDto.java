package com.devesh.examportal.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto{
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String rollNumber;
    private String phoneNumber;
    private String countryCode;
    private String password;

}
