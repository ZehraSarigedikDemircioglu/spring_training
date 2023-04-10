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
public class Ticket extends BaseEntity{

    @ManyToOne
    private MovieCinema movieCinema;
    @ManyToOne
    private UserAccount userAccount;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;
    private Integer seatNumber;
    private Integer rowNumber;
}
