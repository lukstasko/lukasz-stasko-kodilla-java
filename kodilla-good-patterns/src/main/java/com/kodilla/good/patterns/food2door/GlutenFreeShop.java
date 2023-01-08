package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class GlutenFreeShop implements Supplier {
    private String name="Gluten Free Shop";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean process(Product product, int quantity) {
        if (LocalDateTime.now().getDayOfWeek().getValue() > 5) {
            return false;
        } else {
            return true;
        }
    }
}
