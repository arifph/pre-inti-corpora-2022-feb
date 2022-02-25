package com.preTest.backend.demo.repository;

import com.preTest.backend.demo.model.UserContact;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserContactRepository extends JpaRepository<UserContact, String> {
  @Query("SELECT uc FROM UserContact uc")
  List<UserContact> getUserContact();

  @Query("SELECT uc FROM UserContact uc where uc.id = :id")
  UserContact findContactById(@Param("id") String contactId);

  @Modifying
  @Query(
      value = "INSERT INTO UserContact (id, address, userId) values (:id, :address, :userId)",
      nativeQuery = true)
  void addUserContact(
      @Param("id") String id, @Param("address") String address, @Param("userId") String userId);
}
