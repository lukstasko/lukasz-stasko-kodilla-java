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

    }
}
