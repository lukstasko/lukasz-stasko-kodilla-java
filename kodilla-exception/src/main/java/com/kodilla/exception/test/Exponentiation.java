package com.kodilla.exception.test;

public class Exponentiation {

    public int myExp(int a, int b) {

    if(a<0 || b<0){
        throw new ArithmeticException();
    } else if (a==0) {
        return 0;
    } else if (b==0) {
        return 1;
    } else if (b==1) {
        return a;
    }else {
        for (int i = 2; i <= b; i++) {
            a *= a;
        }
        return a;
    }

    }
}

