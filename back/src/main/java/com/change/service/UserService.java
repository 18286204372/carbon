package com.change.service;

import com.change.pojo.User;

public interface UserService {

    String isExist(String id);

    User login(String username,String password);

    User register(String username,String password);

    double queryScore(String id);
}
