package org.han.clienttest.service.impl;

import org.han.clienttest.model.User;
import org.han.clienttest.repository.UserRepository;
import org.han.clienttest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public User findUserById(Integer id) {
        return this.userRepository.getOne(id);
    }

    @Override
    public List<User> findAllUser() {
        return this.userRepository.findAll();
    }

    @Override
    public void insertUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepository.delete(id);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

}
