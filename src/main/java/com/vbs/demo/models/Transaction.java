package com.vbs.demo.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Transaction {
    @Id    //id increment hoga automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(nullable = false)
    double amount;
    @Column(nullable = false)
    double currBalance;
    @Column(nullable = false)
    String description;
    @Column(nullable = false)
    int userId;
    @Column(nullable = false)
    LocalDateTime date;
    @PrePersist   //har baar jab object banega ye trigger hoga - function of this annotation
    protected void onCreate()
    {
        this.date = LocalDateTime.now();
    }



}
