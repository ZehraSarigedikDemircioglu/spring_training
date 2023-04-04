package com.cydeo.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@MappedSuperclass // it won't create account table, using this annotation allow an entity to inherit properties from a base class
// so, we have credit account table and debit account table as child classes of account class
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;
}
