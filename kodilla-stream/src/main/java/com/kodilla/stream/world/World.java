package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> world=new ArrayList<>();

    public void addContinent(Continent continent){
        world.add(continent);
    }

    public List<Continent> getContinent() {
        return world;
    }

    public BigDecimal getPeopleQuntity(){
        return world.stream()
                .flatMap(continent -> continent.getCountrisOnContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
