package com.kodilla.good.patterns.challenges;

public class SendInfoAboutOrder implements InformationService{
    @Override
    public void inform(User user) {

            System.out.println("Information about order is send to " +user.getUsername() +".");

    }
}
