package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverange(){
        //Then
        int[] numbers=new int[20];
        for(int i=0;i<numbers.length;i++){
            numbers[i]= i;
        }

        //Given
        double averange=ArrayOperations.getAverange(numbers);

        //When
        assertEquals(9.5,averange);
    }
}

