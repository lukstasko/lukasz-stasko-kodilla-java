package com.kodilla.good.patterns.food2door;

import java.util.HashSet;
import java.util.Set;

public class HealthyShop implements Supplier {
    private String name="Healthy Shop";
    private Set<String> listOfProduct=new HashSet<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean process(Product product, int quantity) {
        listOfProduct.add("Cucumber");
        listOfProduct.add("Tomato");
        listOfProduct.add("Pumpkin");
        listOfProduct.add("Cabbage");

        return (listOfProduct.contains(product.getName()) && quantity<50);
    }




}
