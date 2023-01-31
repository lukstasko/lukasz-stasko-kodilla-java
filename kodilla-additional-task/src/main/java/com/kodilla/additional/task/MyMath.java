package com.kodilla.additional.task;

import java.util.ArrayList;

public  class MyMath {

    public int maxValue(ArrayList<Integer> list) {
        int max;
        max=list.get(0);
        for(int i:list){
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    public int minValue(ArrayList<Integer> list) {
        int min;
        min=list.get(0);
        for(int i:list){
            if(i<min){
                min=i;
            }
        }
        return min;
    }



}
