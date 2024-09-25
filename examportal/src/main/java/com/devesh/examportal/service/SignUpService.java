package com.devesh.examportal.service;

import com.devesh.examportal.model.Role;
import com.devesh.examportal.model.User;

public interface SignUpService {
    String registerUser(User user, Role role);
}
