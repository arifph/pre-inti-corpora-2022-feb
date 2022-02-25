package com.preTest.backend.demo.service.impl;

import com.preTest.backend.demo.model.User;
import com.preTest.backend.demo.repository.UserRepository;
import com.preTest.backend.demo.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Autowired UserRepository userRepository;

  @Override
  public List<User> getUser() {
    return userRepository.getUser();
  }

  @Override
  public List<User> fetchAllUser() {
    return userRepository.findAll();
  }

  @Override
  public User addUser(User user) {
    userRepository.addUser(user.getId(), user.getName(), user.getAge());
    return userRepository.findUserById(user.getId());
  }
}
