package com.example.dynamicrole2.service;

import com.example.dynamicrole2.model.User;

public interface UserService {


    public boolean existByUserName(String username);


    public boolean existByEmail(String email);


    public User saveUser(User user);
}
