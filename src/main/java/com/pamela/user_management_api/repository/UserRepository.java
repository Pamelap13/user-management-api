package com.pamela.user_management_api.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public String getData(){
        return "Data from repository";
    }
}
