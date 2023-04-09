package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data

public class MovieCinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(columnDefinition = "DATE")
    private LocalDate dateTime;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Cinema cinema;
}
