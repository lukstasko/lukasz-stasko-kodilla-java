package com.kodilla.patterns.strategy.social;

import java.util.concurrent.Flow;

public class TwitterPublisher implements SocialPublisher{

    @Override
    public String share() {
        return "Share to Twitter";
    }
}
