package com.kodilla.patterns.strategy.social;

public class SnapchatPublischer implements SocialPublisher{
    @Override
    public String share() {
        return "Share to Snapchat" ;
    }
}
