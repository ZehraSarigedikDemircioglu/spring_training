package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class MovieCinema extends BaseEntity{
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;
    @ManyToOne(fetch = FetchType.LAZY) // related about performance
    private Movie movie;
    @ManyToOne(fetch = FetchType.LAZY) // behind the scene, spring boot bring all data even if we do not use that time
    private Cinema cinema;

    @Override
    public String toString() {
        return "MovieCinema{" +
                "dateTime=" + dateTime +
                '}';
    }
}
