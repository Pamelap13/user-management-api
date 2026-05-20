package com.pamela.user_management_api.repository;

import com.pamela.user_management_api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public UserRepository(){
        users.add(new User(1L, "Pamela", "pamela@email.com"));
        users.add(new User(2L, "Ana", "ana@email.com"));
    }
    public List<User> findall(){
        return users;
    }
    public User save (User user){
        users.add(user);
        return user;
    }
}
