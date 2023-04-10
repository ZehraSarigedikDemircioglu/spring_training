package com.cydeo.entity;

import com.cydeo.enums.State;
import com.cydeo.enums.Type;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Movie extends BaseEntity{

    private String name;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private State state;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime releaseDate;
    private Integer duration;
    private String summary;
    @ManyToMany
    @JoinTable(name = "movie_genre_rel",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genreList;
}
