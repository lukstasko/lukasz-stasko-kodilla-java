package com.kodilla.additional.task;

import java.lang.reflect.Array;
import java.util.*;

public class mainTask {
    public static void main(String[] args) {

        MyMath myMath=new MyMath();

        Integer arr[]={1,5,6,7,9,15,3,4,7,10,-1};
        ArrayList<Integer> list= new ArrayList<>();
        Collections.addAll(list,arr);

        System.out.println("MAX: "+ myMath.maxValue(list));
        System.out.println("MIN: "+ myMath.minValue(list));

        int a=12;
        System.out.println( "Is "+a+ " prime? -"+myMath.isPrime(a) );

        Integer[] listToSort={9,5,4,3,7,2,1};
            Arrays.stream(listToSort)
                    .forEach(System.out::print);
        Integer[] sortedList=myMath.sortAZ(listToSort);
        System.out.println();
        Arrays.stream(sortedList)
                .forEach(System.out::print);

        System.out.println("Sorted 2");
        Integer[] listToSort2={9,5,4,3,7,2,1};
        ArrayList<Integer> arrayListToSort= new ArrayList<>();
        Collections.addAll(arrayListToSort,listToSort2);
        arrayListToSort.stream()
                .forEach(System.out::print);
        System.out.println();
        myMath.sortAZ_1(arrayListToSort).stream()
                .forEach(System.out::print);

        System.out.println("Buble sorted");
        Integer[] listToSort3={9,5,4,3,7,2,1};
        ArrayList<Integer> arrayListToBubbleSort= new ArrayList<>();
        Collections.addAll(arrayListToBubbleSort,listToSort3);
        arrayListToBubbleSort.stream()
                .forEach(System.out::print);
        System.out.println();
        myMath.bubbleSortAZ(arrayListToBubbleSort).stream()
                .forEach(System.out::print);


    }
}
