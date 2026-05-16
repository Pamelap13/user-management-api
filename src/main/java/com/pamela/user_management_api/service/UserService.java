package com.pamela.user_management_api.service;

import com.pamela.user_management_api.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getMessage(){
        return userRepository.getData();
    }
}
