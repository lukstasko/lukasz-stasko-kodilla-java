package com.kodilla.good.patterns.challenges;

public class GameOrderService implements OrderService{

    @Override
    public boolean order(User user, Product product, int quantity) {
        if (user.getAdres()!=null && user.getRealName()!=null && quantity>0) {
            System.out.println(product.getName()+" order accepted.");
            return true;
        }else {
            return false;
        }
    }
}
