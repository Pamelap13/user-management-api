package com.pamela.user_management_api.service;

import com.pamela.user_management_api.model.User;
import com.pamela.user_management_api.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findall();
    }
    public User createUser(User user){
        return userRepository.save(user);
    }
}
