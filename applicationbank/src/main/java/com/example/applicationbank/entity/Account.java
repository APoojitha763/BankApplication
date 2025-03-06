package com.example.applicationbank.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")//maps this entity to the accounts table in the database table
@Entity // marks this class as a JPA entity
public class Account {
    @Id //to go to id field annotate id field to make this id field as a primary key in our database
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to configure primary key generation strategy
    private Long id;

    @Column(name ="account_holder_name")
    private String accountHolderName;
    private double balance;
}
