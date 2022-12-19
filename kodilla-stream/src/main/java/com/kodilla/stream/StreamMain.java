package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier=new PoemBeautifier();
        poemBeautifier.beautify("sample text",string -> string.toUpperCase());
        poemBeautifier.beautify("sample text",string -> "ABC_ "+string+" _ABC");
        poemBeautifier.beautify("sample text",string -> string.substring(0,1).repeat(3)+string.replace(" ","_")+string.substring(string.length()-1,string.length()).repeat(3));
        poemBeautifier.beautify("sample text",string ->"<(o_"+string.toUpperCase(Locale.ROOT)+"_o)>") ;
        /*System.out.println("Welcome to module7 -Stream");
        /*SaySomething saySomething=new SaySomething();
        saySomething.say();*/

       /* Processor processor=new Processor();
        Executor codeToExecute=() -> System.out.println("This is an example test");
        processor.execute(codeToExecute);
        */
        System.out.println();
        ExpressionExecutor expressionExecutor=new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
