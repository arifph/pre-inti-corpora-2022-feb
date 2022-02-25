package com.preTest.backend.demo.model;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "user_contact")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserContact {
  @Id
  @Column(name = "id", length = 10, nullable = false)
  String id;

  @Column(name = "address", length = 30, nullable = false)
  String address;

  @ManyToOne User user;
}
