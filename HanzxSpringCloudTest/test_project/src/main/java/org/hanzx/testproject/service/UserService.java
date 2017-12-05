package org.hanzx.testproject.service;

import org.hanzx.testproject.model.User;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    User findUserById(Integer id);

    List<User> findAllUser();

    void insertUser(User user);

    void deleteUserById(Integer id);

    void updateUser(User user);
}
