package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        //double result=0.0;
        try {
        double result = firstChallenge.divide(3.0, 0);
            System.out.println(result);
       }catch(ArithmeticException e){
            System.out.println("Cannot by divided by zero! \nError: " +e);
        }finally {
             System.out.println("End");
        }

 Exponentiation exponentiation=new Exponentiation();
       double result= exponentiation.myExp(2,0);
        System.out.println(result);
    }
}