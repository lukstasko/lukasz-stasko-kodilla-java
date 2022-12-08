package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        System.out.println("Start test: SimpleUser");

        SimpleUser simpleuser=new SimpleUser("theForumUser");

        String result= simpleuser.getUsername();
        if (result.equals("theForumUser")){
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }
        System.out.println("End test\n");

        System.out.println("Start test: Calculator");
        Calculator calculator=new Calculator();

        System.out.println("Testing ADD function");
        int a=5;
        int b=2;
        int result1= calculator.add(a,b);

        if(result1==a+b){
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }

        System.out.println("\nTesting subtract function");
        result1= calculator.subtract(a,b);

        if(result1==a-b){
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }
        System.out.println("End test");
    }
}
