package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private Supplier supplier;
    private Product product;
    private int quantity;

    public OrderRequest(final Supplier supplier, final Product product, final int quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
