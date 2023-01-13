package com.kodilla.spring.forum;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumUSerTestSuite {

    @Test
    void testGetUsername(){
        //Given
        ApplicationContext context=new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser=context.getBean(ForumUser.class);

        //Then
        String name=forumUser.username;

        //When
        assertEquals("John Smith",name);
    }
}
