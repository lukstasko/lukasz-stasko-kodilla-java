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

    public boolean isPrime(int a){
        for (int i=2;i<(a/2);i++){
            if (a%i==0) return false;
        }
            return true;
    }

    public ArrayList<Integer> sortAZ_1(ArrayList<Integer> list){
        ArrayList<Integer> resultlist=new ArrayList<>();
       int max;
        for (int i:list ) {
           max=maxValue(list);
           if(max>=0){
               resultlist.add(0,max);
               list.set(list.indexOf(max),-max);
           }
        }
        return resultlist;
    }

    public Integer[] sortAZ(Integer[] list){
      int x;
        for (int j=0;j<list.length;j++){
           for (int i=1;i<list.length;i++) {
               if (list[i - 1] > list[i]) {
                   x = list[i - 1];
                   list[i - 1] = list[i];
                   list[i] = x;
               }
           }
       }
    return list;
    }

    public ArrayList<Integer> bubbleSortAZ(ArrayList<Integer> list){
        int bufor;

        for(int n=list.size();n>0;n--) {
            for (int i = 1; i < n; i++) {
                if (list.get(i - 1) > list.get(i)) {
                    bufor = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, bufor);
                }
            }
        }
        return list;
    }

}
