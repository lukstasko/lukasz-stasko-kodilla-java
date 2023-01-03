package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbablyIWillThrowExceptionTestSuite {

    @Test
    void testProbablyIWillThrowExceptionTestSuite_BoundaryConditions(){
        //Given
        SecondChallenge secondChallenge=new SecondChallenge();
        //When & Then
        assertAll(
                ()->assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(2.0,1)),
                ()->assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(0.9,2.0)),
                ()->assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(1.1,1.5)),
                ()->assertDoesNotThrow(()->secondChallenge.probablyIWillThrowException(1.1,1))
        );
    }
}
