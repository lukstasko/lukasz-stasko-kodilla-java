package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(3, 2));
        } catch (Exception e) {
            System.out.println("You put wrong numbers!");
        }
        finally {
            System.out.println("End");
        }

    }

}

