package com.cydeo.entity;

import com.cydeo.enums.Role;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class AccountDetails {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private Integer age;
    private String postalCode;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToOne
    private UserAccount userAccount;
}
