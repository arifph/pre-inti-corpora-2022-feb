package com.preTest.backend.demo.controller;

import com.preTest.backend.demo.service.UserContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contact")
@Slf4j
public class UserContactController {
    @Autowired
    UserContactService contactService;


}
