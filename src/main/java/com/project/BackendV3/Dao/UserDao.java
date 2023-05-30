package com.project.BackendV3.Dao;

import com.project.BackendV3.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserDao  extends JpaRepository<User, Long> {
    Optional<User> findByName(String username);
}
