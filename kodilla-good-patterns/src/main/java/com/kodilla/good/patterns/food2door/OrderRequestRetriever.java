package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {

    public OrderRequest retrieved() {
        return new OrderRequest(new HealthyShop(),new SampleProduct("Tomato"),5);
    }
}
