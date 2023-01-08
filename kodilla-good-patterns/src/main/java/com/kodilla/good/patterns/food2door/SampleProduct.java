package com.kodilla.good.patterns.food2door;

public class SampleProduct implements Product {
private String name;

    public SampleProduct(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
