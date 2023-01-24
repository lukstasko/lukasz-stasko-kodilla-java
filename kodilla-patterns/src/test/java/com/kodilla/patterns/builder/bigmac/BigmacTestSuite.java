package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew(){
        //Given
        Bigmac bigmac=new Bigmac.BigmacBuilder()
                .bun("Bun with sesame")
                .burgers(2)
                .sauce("Standard")
                .ingredients("Onion","Tomato","Cucumber","Bacon","Cheese")
                .build();
        System.out.println(bigmac);

        //When
        int howManyBurgers= bigmac.getBurgers();
        String whatBun= bigmac.getBun();
        String whatSauce= bigmac.getSauce();

        //Then
        assertEquals(2,howManyBurgers);
        assertEquals("Bun with sesame",whatBun);
        assertEquals("Standard",whatSauce);
    }
}
