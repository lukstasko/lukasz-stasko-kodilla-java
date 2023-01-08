package com.kodilla.good.patterns.food2door;

public class OrderStatus {

    void sendOrderStatus(boolean status,OrderRequest orderRequest) {
        if (status) {
            System.out.println(orderRequest.getSupplier().getName()+ " fulfilled the order.");
        } else {
            System.out.println(orderRequest.getSupplier().getName()+ " cancelled the order.");
        };
    }
    void sendOrderStatus(boolean status,Supplier supplier) {
        if (status) {
            System.out.println("\"" +supplier.getName()+ "\" fulfilled the order.");
        } else {
            System.out.println("\"" +supplier.getName()+ "\" cancelled the order.");
        };
    }

}
