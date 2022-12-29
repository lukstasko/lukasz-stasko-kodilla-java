package com.kodilla.stream.world;

import com.kodilla.stream.sand.SandStorage;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        //Europe
        Country albania=new Country(new BigDecimal(   "3100000"));
        Country andorra=new Country(new BigDecimal(    "100000"));
        Country austria=new Country(new BigDecimal(  "10000000"));
        //Asia
        Country china=new Country(new BigDecimal(  "1500000000"));
        Country india=new Country(new BigDecimal(  "1400000000"));
        //Africa
        Country egypt=new Country(new BigDecimal(  "100000000"));
        Country libya=new Country(new BigDecimal(     "7000000"));
        Country tunisia=new Country(new BigDecimal(  "10000000"));

        Continent europe=new Continent();
        europe.addCountry(albania);
        europe.addCountry(andorra);
        europe.addCountry(austria);

        Continent asia=new Continent();
        asia.addCountry(china);
        asia.addCountry(india);

        Continent africa=new Continent();
        africa.addCountry(egypt);
        africa.addCountry(libya);
        africa.addCountry(tunisia);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal totalPeopleQuantity=world.getPeopleQuntity();

        //Then
        BigDecimal expectedPeopleQuantity=new BigDecimal("3030200000");
        assertEquals(expectedPeopleQuantity,totalPeopleQuantity);


    }

}
