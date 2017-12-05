package org.han.clienttest.service;

import org.han.clienttest.model.User;

import java.util.List;

public interface UserService {

    User findUserById(Integer id);

    List<User> findAllUser();

    void insertUser(User user);

    void deleteUserById(Integer id);

    void updateUser(User user);
}
