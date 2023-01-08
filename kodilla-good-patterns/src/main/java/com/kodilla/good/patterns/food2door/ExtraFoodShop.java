package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Supplier{
    private String name="Extra Food Shop";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean process(Product product, int quantity) {
        if(quantity>10) {
            return false;
        }else {
            return true;
        }
    }
}
