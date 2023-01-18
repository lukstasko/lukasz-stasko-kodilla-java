package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {

        //Given
        ApplicationContext context=new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board=context.getBean(Board.class);

        //When
        board.toDoList.addTask("First task to do.");
        board.inProgressList.addTask("First task in progress.");
        board.doneList.addTask("First done task.");

        //Then
        assertEquals("First task to do.",board.toDoList.task.get(0));
        assertEquals("First task in progress.",board.inProgressList.task.get(0));
        assertEquals("First done task.",board.doneList.task.get(0));
    }
}
