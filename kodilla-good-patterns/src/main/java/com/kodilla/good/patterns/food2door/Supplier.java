package com.kodilla.good.patterns.food2door;

public interface Supplier {
    String getName();
    boolean process(Product product,int quantity);

}
