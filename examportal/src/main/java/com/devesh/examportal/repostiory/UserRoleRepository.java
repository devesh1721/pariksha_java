package com.devesh.examportal.repostiory;

import com.devesh.examportal.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
