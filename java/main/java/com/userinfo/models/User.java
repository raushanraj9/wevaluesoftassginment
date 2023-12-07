package com.demo.models;

//User.java
@Entity
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(nullable = false)
 private String username;

 @Column(nullable = false)
 private String password;

 @ElementCollection
 @Enumerated(EnumType.STRING)
 private Set<Role> roles;

 @Enumerated(EnumType.STRING)
 private Position position;

 // getters and setters
}