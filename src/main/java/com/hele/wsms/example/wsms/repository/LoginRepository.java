package com.batch2.artifact1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.batch2.artifact1.domain.Login;

public interface LoginRepository extends JpaRepository<Login, String> {
    Login findByUsernameAndPassword(String username, String password);
}
