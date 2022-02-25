package com.preTest.backend.demo.service.impl;

import com.preTest.backend.demo.model.UserContact;
import com.preTest.backend.demo.repository.UserContactRepository;
import com.preTest.backend.demo.service.UserContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserContactServiceImpl implements UserContactService {
    @Autowired
    UserContactRepository contactRepository;

    @Override
    public List<UserContact> getUserContact() {
        return contactRepository.getUserContact();
    }

    @Override
    public List<UserContact> fetchAllUserContact() {
        return contactRepository.findAll();
    }

    @Override
    public UserContact addUserContact(UserContact userContact) {
        contactRepository.addUserContact(userContact.getId(), userContact.getAddress(), userContact.getUser().getId());
        return contactRepository.findContactById(userContact.getId());
    }
}
