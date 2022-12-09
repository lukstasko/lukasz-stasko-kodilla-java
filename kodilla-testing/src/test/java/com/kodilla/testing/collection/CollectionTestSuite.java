package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.*;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Suite: begin");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Test Suite: end");
    }

    @DisplayName("When input list is empty, " +
            "then exterminate should return empty list")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        /* Given */
        OddNumbersExterminator oddNumbersExterminator=new OddNumbersExterminator();
        /* When */
        List <Integer>  result=oddNumbersExterminator.exterminate(Arrays.asList(new Integer[] {}));
        /* Then */
        Assertions.assertEquals(Arrays.asList(new Integer[] {}),result);
    }

    @DisplayName("When input list contains even and odd numbers, " +
            "then exterminate should return even number")
    @Test
    void testOddNumbersExterminatorNormalList(){
        /* Given */
        List <Integer> list= Arrays.asList(new Integer[] {0,1,2,3,4,5,6,7,8,9});
        OddNumbersExterminator oddNumbersExterminator=new OddNumbersExterminator();
        /* When */
        List <Integer>  result=oddNumbersExterminator.exterminate(list);
        /* Then */
        Assertions.assertEquals(Arrays.asList(0,2,4,6,8),result);
    }

}
