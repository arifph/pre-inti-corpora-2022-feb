package com.preTest.backend.demo.controller;

import com.preTest.backend.demo.model.User;
import com.preTest.backend.demo.model.UserContact;
import com.preTest.backend.demo.service.UserContactService;
import com.preTest.backend.demo.service.UserService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
  @Autowired UserService userService;

  @Autowired
  UserContactService userContactService;

  @GetMapping(path = "/getAll", produces = "application/json")
  public ResponseEntity<List<User>> getUser() {
    log.info("Fetching all users..");
    return ResponseEntity.ok(userService.getUser());
  }

  @GetMapping(path = "/contact/getAll", produces = "application/json")
  public ResponseEntity<List<UserContact>> getUserContact() {
    log.info("Fetching all user contacts..");
    return ResponseEntity.ok(userContactService.getUserContact());
  }
}
