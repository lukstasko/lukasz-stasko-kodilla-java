package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="PRODUCT")
public class Product {
    private int id;
    private String name;
    private List<Item> items=new ArrayList<>();

    public Product() {
    }

    public Product(String name) {
           this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="PRODUCT_ID",unique = true)
    public int getId() {
        return id;
    }

    @Column(name="PRODUCT_NAME")
    public String getName() {
        return name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch =FetchType.EAGER,
            orphanRemoval = true
    )
    public List<Item> getItems() {
        return items;
    }

    private void setItems(List<Item> items) {
        this.items = items;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}
