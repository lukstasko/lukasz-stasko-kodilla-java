package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PizzaOrderTestSuite {

    @Test
    public void testBaconHamChampignonsAndExtraCheeseGetCost(){
        //Given
        PizzaOrder theOrder=new BasicPizzaOrder();
        theOrder=new BaconDecorator(theOrder);
        theOrder=new HamDecorator(theOrder);
        theOrder=new ChampignonsDecorator(theOrder);
        theOrder=new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal calculatedCost=theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(30),calculatedCost);
    }
    @Test
    public void testBaconHamChampignonsAndExtraCheeseDescription(){
        //Given
        PizzaOrder theOrder=new BasicPizzaOrder();
        theOrder=new BaconDecorator(theOrder);
        theOrder=new HamDecorator(theOrder);
        theOrder=new ChampignonsDecorator(theOrder);
        theOrder=new ExtraCheeseDecorator(theOrder);
        //When
        String description=theOrder.getDescription();
        //Then
        assertEquals("Pizza + tomato sauce + cheese + bacon + ham + champignons + extra cheese",description);
    }

    @Test
    public void testHamAndExtraCheeseGetCost(){
        //Given
        PizzaOrder theOrder=new BasicPizzaOrder();
        theOrder=new HamDecorator(theOrder);
        theOrder=new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal calculatedCost=theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(23),calculatedCost);
    }
    @Test
    public void testHamAndExtraCheeseDescription(){
        //Given
        PizzaOrder theOrder=new BasicPizzaOrder();
        theOrder=new HamDecorator(theOrder);
        theOrder=new ExtraCheeseDecorator(theOrder);
        //When
        String description=theOrder.getDescription();
        //Then
        assertEquals("Pizza + tomato sauce + cheese + ham + extra cheese",description);
    }

    @Test
    public void testHamAndChampignonsGetCost(){
        //Given
        PizzaOrder theOrder=new BasicPizzaOrder();
        theOrder=new HamDecorator(theOrder);
        theOrder=new ChampignonsDecorator(theOrder);
        //When
        BigDecimal calculatedCost=theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(21),calculatedCost);
    }
    @Test
    public void testHamAndChampignonsDescription(){
        //Given
        PizzaOrder theOrder=new BasicPizzaOrder();
        theOrder=new HamDecorator(theOrder);
        theOrder=new ChampignonsDecorator(theOrder);
        //When
        String description=theOrder.getDescription();
        //Then
        assertEquals("Pizza + tomato sauce + cheese + ham + champignons",description);
    }
    @Test
    public void testChampignonsGetCost(){
        //Given
        PizzaOrder theOrder=new BasicPizzaOrder();
        theOrder=new ChampignonsDecorator(theOrder);
        //When
        BigDecimal calculatedCost=theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(17),calculatedCost);
    }
    @Test
    public void testChampignonsDescription(){
        //Given
        PizzaOrder theOrder=new BasicPizzaOrder();
        theOrder=new ChampignonsDecorator(theOrder);
        //When
        String description=theOrder.getDescription();
        //Then
        assertEquals("Pizza + tomato sauce + cheese + champignons",description);
    }
    @Test
    public void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder theOrder=new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost=theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15),calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription(){
        //Given
        PizzaOrder theOrder=new BasicPizzaOrder();
        //When
        String description=theOrder.getDescription();
        //Then
        assertEquals("Pizza + tomato sauce + cheese",description);
    }
}
