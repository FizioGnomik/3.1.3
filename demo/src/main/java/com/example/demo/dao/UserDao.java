package com.example.demo.dao;


import com.example.demo.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    void deleteUser(long id);
    User getUserByName(String name);
    User getUserById(long id);
    void addUser(User user);
    void updateUser(User user);

}
