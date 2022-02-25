package com.preTest.backend.demo.repository;

import com.preTest.backend.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
  @Query("SELECT u FROM User u")
  List<User> getUser();

  @Query("SELECT u FROM User u WHERE u.id = :id")
  User findUserById(@Param("id") String id);

  @Modifying
  @Query(value = "INSERT INTO User (id, name, age) values (:id, :name, :age)", nativeQuery = true)
  void addUser(@Param("id") String id, @Param("name") String name, @Param("age") int age);
}
