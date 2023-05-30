package com.project.BackendV3.service;

import com.project.BackendV3.Dao.UserDao;
import com.project.BackendV3.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public String addUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userDao.save(user);
        return "user added to system ";
    }

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public Optional<User> getUser(Long id) {
        return userDao.findById(id);
    }
}
