package com.preTest.backend.demo.service;

import com.preTest.backend.demo.model.User;
import java.util.List;

public interface UserService {
  List<User> getUser();

  List<User> fetchAllUser();

  User addUser(User user);
}
