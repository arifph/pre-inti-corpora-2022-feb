package com.preTest.backend.demo.service;

import com.preTest.backend.demo.model.UserContact;

import java.util.List;

public interface UserContactService {
    List<UserContact> getUserContact();

    List<UserContact> fetchAllUserContact();

    UserContact addUserContact(UserContact userContact);
}
