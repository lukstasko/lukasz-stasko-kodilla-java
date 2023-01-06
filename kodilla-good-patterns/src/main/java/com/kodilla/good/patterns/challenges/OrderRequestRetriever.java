package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user=new User("John","John Lo","jognlo@com",new Address("Krakow","34-253","Opolska","5"));
        GameProduct gameProduct =new GameProduct("Chess");
        return new OrderRequest(user, gameProduct,1);
    }
}
