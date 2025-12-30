package com.vbs.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //to create table
@Data   //create getter and setter automatically
@AllArgsConstructor //create construcator
@NoArgsConstructor  //create empty constructor
public class User {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(nullable = false ,unique = true)
    String username;
    @Column(nullable = false)
    String password;
    @Column(nullable = false,unique=true)
    String email;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String role;
    @Column(nullable = false)
    double balance;



}
