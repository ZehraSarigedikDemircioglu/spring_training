package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "COURSES")
@Getter
@Setter
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "RATING")
    private Integer rating;
    @Column(name = "DESCRIPTION")
    private String description;
}
