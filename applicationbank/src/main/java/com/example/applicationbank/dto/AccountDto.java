package com.example.applicationbank.dto;

import lombok.Data;

@Data
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;
    private String accountType;

}
