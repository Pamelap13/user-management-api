package com.pamela.user_management_api.service;

import com.pamela.user_management_api.exception.UserNotFoundException;
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
        return userRepository.findAll();
    }
    public User createUser(User user){
        return userRepository.save(user);
    }
    public User getUserById( Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User Not Found"));
    }
    public User updateUser(Long id, User updateUser ){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User Not Found"));
        user.setName(updateUser.getName());
        user.setEmail(updateUser.getEmail());
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User Not Found"));
        userRepository.delete(user);
    }

}
