package com.kodilla.good.patterns.food2door;

public class SupplierOrderService implements OrderService {
    @Override
    public boolean order(Supplier supplier, Product product, int quantity) {
        return supplier.process(product, quantity);
    }
}
