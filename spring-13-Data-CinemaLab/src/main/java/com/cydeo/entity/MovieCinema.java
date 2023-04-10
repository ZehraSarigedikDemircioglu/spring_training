package com.cydeo.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class MovieCinema extends BaseEntity{
    @Column(columnDefinition = "DATE")
    private LocalDate dateTime;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Cinema cinema;
}
