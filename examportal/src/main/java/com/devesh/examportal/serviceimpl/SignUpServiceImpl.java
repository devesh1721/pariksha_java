package com.devesh.examportal.serviceimpl;

import com.devesh.examportal.model.*;
import com.devesh.examportal.repostiory.CountryCodeRepository;
import com.devesh.examportal.repostiory.RoleRepository;
import com.devesh.examportal.repostiory.UserRepository;
import com.devesh.examportal.repostiory.UserRoleRepository;
import com.devesh.examportal.service.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private CountryCodeRepository countryCodeRepository;

    @Override
    public String registerUser(UserDto userDto) throws Exception {
        log.info("Inside the registerUser of SignUpServiceImpl.java : START");
        Role r = new Role();
        r.setId(2L);
        r.setRoleName("Students");
        roleRepository.save(r);
        CountryCode countryCode = countryCodeRepository.findByCode(userDto.getCountryCode());
//        if(countryCode == null){
//            throw new Exception("Country Code is invalid");
//        }
        User user = User.builder()
                .userName(userDto.getUserName())
                .email(userDto.getEmail())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .password(userDto.getPassword())
                .countryCode(countryCode)
                .build();
        UserRole userRole = new UserRole(2, user, r);
        userRoleRepository.save(userRole);
        return "";

    }
}
