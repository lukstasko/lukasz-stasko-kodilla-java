package com.kodilla.good.patterns.challenges;

public class GameProduct implements Product{
    String name;

    public GameProduct(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
