package com.cydeo.entity;

import javax.persistence.*;

@Entity
@Table(name = "students") // this is the good practice with making plural form
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // postgres is creating
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
