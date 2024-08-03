package com.example.springboot.service;

import com.example.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void add(User user);
    void edit(User user);
    void delete(int id);
    User getById(int id);
}
