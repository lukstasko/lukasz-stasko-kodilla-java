package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;
    @Test
    void testCalculations(){

        //Given
        //When
        double add= calculator.add(4,2);
        double sub= calculator.sub(4,2);
        double mul= calculator.mul(4,2);
        double div= calculator.div(4,2);
        //Then
        assertEquals(6.0,add);
        assertEquals(2.0,sub);
        assertEquals(8.0,mul);
        assertEquals(2.0,div);

    }
}
