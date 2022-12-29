package com.kodilla.stream.world;

import com.kodilla.stream.invoice.simple.SimpleItem;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> continent=new ArrayList<>();

    public void addCountry(Country country){
        continent.add(country);
    }

    public List<Country> getCountrisOnContinent() {
        return continent;
    }
}
