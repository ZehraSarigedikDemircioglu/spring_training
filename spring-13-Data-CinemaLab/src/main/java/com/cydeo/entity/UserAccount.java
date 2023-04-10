package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class UserAccount extends BaseEntity{

    @OneToOne
    private AccountDetails accountDetails;
    private String email;
    private String password;
    private String username;
}
