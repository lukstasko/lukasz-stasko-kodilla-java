package com.kodilla.good.patterns.food2door;

public interface OrderService {
    boolean order(Supplier supplier, Product product, int quantity);
}
