package com.kodilla.good.patterns.food2door;


public class OrderProcessor {
    private OrderRequest orderRequest;
    private OrderService orderService;
    private OrderStatus orderStatus;

    public OrderProcessor(final OrderRequest orderRequest, final OrderService orderService, final OrderStatus orderStatus) {
        this.orderRequest = orderRequest;
        this.orderService = orderService;
        this.orderStatus = orderStatus;
    }

    void orderProcess() {
        orderStatus.sendOrderStatus(orderService.order(orderRequest.getSupplier(), orderRequest.getProduct(), orderRequest.getQuantity()),
                                    orderRequest.getSupplier());
    }
}

