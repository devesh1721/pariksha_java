package com.devesh.examportal.serviceimpl;

import com.devesh.examportal.model.Role;
import com.devesh.examportal.model.User;
import com.devesh.examportal.model.UserRole;
import com.devesh.examportal.repostiory.RoleRepository;
import com.devesh.examportal.repostiory.UserRepository;
import com.devesh.examportal.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public String registerUser(User user, Role role) {
        Role r = new Role();
        r.setId(1L);
        r.setRoleName("Student");
        roleRepository.save(r);

        User user1 = new User();
        user1.setId(1);
        user1.setUserName("devesh_sharma");
        user1.setEmail("devesh29476@gmail.com");
        user1.setPassword("12321312");
        user1.setRollNumber("12312312312312");
        UserRole userRole = new UserRole(1, user1, r);
        List<UserRole> userRoleList = new ArrayList<>();
        userRoleList.add(userRole);
        user1.setUserRoles(userRoleList);
        userRepository.save(user1);
        return "";
    }
}
