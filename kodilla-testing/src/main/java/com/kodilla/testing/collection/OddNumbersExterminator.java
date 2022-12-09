package com.kodilla.testing.collection;
import java.util.*;
public class OddNumbersExterminator {
   private List<Integer> exterminateNumbers=new ArrayList<>();
    public List<Integer> exterminate(List<Integer> numbers){

        for(Integer num :numbers) {
            if(num%2==0){
               exterminateNumbers.add(num) ;
            }
        }
    return exterminateNumbers;
    }


}
