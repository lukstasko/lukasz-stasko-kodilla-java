package com.kodilla.exception.test;

public class MyMath {
    public int myExp(int a, int b) {
        int result=1;
        if(a<0 || b<0){
            throw new ArithmeticException();
        } else if (a==0) {
            return 0;
        } else if (b==0 || a==1) {
            return 1;
        } else if (b==1) {
            return a;
        }else {
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
            return result;
        }
    }

    public int nFactorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
