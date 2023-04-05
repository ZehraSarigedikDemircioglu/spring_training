package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;
    @ManyToMany(mappedBy = "items") // it will create foreign key, but no table using mappedBy
    private List<Cart> carts;

    public Item(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
