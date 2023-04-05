package com.gnlsystems.vcs.service;

import com.gnlsystems.vcs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public boolean checkEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}
