package com.cydeo.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "students") // this is the good practice with making plural form
public class Student {
    @Id // whatever we write any annotation this section, it is a sql code behind of scene.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // postgres is creating
    private Long id;

    @Column(name = "studentFirstName") // it is not common
    private String firstName;
    @Column(name = "studentLastName")
    private String lastName;
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;
    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime birthDateTime;

}
