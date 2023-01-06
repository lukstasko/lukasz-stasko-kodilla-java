package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever=new OrderRequestRetriever();
        OrderRequest orderRequest=orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor=new OrderProcessor(new SendInfoAboutOrder(),new GameOrderService(),new GameOrderRepository());
        orderProcessor.process(orderRequest);

    }
}
