package com.kodilla.good.patterns.food2door;

public class CreateAnOrder {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever=new OrderRequestRetriever();
        OrderRequest orderRequest=orderRequestRetriever.retrieved();

        OrderProcessor orderProcessor =new OrderProcessor(orderRequest,new SupplierOrderService(),new OrderStatus());
        orderProcessor.orderProcess();
    }
}
