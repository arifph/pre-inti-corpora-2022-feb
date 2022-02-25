package com.preTest.backend.demo.model;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "user")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
  @Id
  @Column(name = "id", length = 10, nullable = false)
  private String id;

  @Column(name = "name", length = 30, nullable = false)
  private String name;

  @Column(name = "age", nullable = false)
  private int age;
}
