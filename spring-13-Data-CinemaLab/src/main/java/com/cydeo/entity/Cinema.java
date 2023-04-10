package com.cydeo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Cinema extends BaseEntity{

    private String name;
    private String sponsoredName;
    @ManyToOne
    private Location location;
}
