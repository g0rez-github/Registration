package com.g0rez.dao;

import com.g0rez.entity.User;


public interface UserDao {
    User selectUser(String username);
    Integer insertUser(User user);
}
