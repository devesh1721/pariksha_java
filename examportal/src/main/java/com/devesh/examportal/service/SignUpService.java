package com.devesh.examportal.service;

import com.devesh.examportal.model.Role;
import com.devesh.examportal.model.User;
import com.devesh.examportal.model.UserDto;

public interface SignUpService {
    String registerUser(UserDto user) throws Exception ;
}
