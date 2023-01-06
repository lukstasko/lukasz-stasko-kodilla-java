package com.kodilla.good.patterns.challenges;

public class GameOrderRepository implements OrderRepository {

    @Override
    public void createOrder(User user, Product product, int quantity) {
        System.out.println("Order is saving in database...");
    }
}
