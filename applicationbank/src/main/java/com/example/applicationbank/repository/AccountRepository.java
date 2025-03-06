package com.example.applicationbank.repository;

import com.example.applicationbank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    //Jparepository is generic interface and we need to give 2 parameters entity name and type of primary key
    // when we add JpaRepository  it mainly uses to perform crud operation on the account entity

}