package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum=new Forum();
        Map<Integer, ForumUser> theResultMapOfUser=forum.getTheForumUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M' && LocalDate.now().isAfter(forumUser.getBirthday().plusYears(20)) && forumUser.getQuantityOfPost()>0)
                .collect(Collectors.toMap(ForumUser::getId,user->user));

        theResultMapOfUser.entrySet().stream()
                .map(entry->entry.getKey()+": "+entry.getValue())
                .forEach(System.out::println);





        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/

        /*BookDirectory theBookDirectory=new BookDirectory();
        Map<String,Book> theResultMapOfBook=theBookDirectory.getList().stream()
                .filter((book -> book.getYearOfPublication()>2005))
                .collect(Collectors.toMap(Book::getSignature,book -> book));
        System.out.println("# elements: "+theResultMapOfBook.size());
        theResultMapOfBook.entrySet().stream()
                .map(entry->entry.getKey()+": "+entry.getValue())
                .forEach(System.out::println);*/

       /* People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length()>11)
                .map(s -> s.substring(0,s.indexOf(" ")+2)+".")
                .filter(s -> s.substring(0,1).equals("M"))
                .forEach(System.out::println);*/

               // .map(s -> s.toUpperCase())
               // .forEach((System.out::println));

               // .map(String::toUpperCase)
               // .forEach(s -> System.out.println(s));

               // .filter(s -> s.length()>11)
               // .forEach(System.out::println);

        /*PoemBeautifier poemBeautifier=new PoemBeautifier();
        poemBeautifier.beautify("sample text",string -> string.toUpperCase());
        poemBeautifier.beautify("sample text",string -> "ABC_ "+string+" _ABC");
        poemBeautifier.beautify("sample text",string -> string.substring(0,1).repeat(3)+string.replace(" ","_")+string.substring(string.length()-1,string.length()).repeat(3));
        poemBeautifier.beautify("sample text",string ->"<(o_"+string.toUpperCase(Locale.ROOT)+"_o)>") ;
        *//*System.out.println("Welcome to module7 -Stream");
        /*SaySomething saySomething=new SaySomething();
        saySomething.say();*//*

       *//* Processor processor=new Processor();
        Executor codeToExecute=() -> System.out.println("This is an example test");
        processor.execute(codeToExecute);
        *//*
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
        NumbersGenerator.generateEven(20);*/
    }
}
