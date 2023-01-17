package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {
    @Autowired
    Board board;
    @Test
    void testTaskAdd(){
        //Given

        //When
        board.getToDoList().addTask("First task to do.");
        board.getInProgressList().addTask("First task in progress.");
        board.getDoneList().addTask("First done task.");
        //Then
        assertEquals("First task to do.",board.getToDoList().task.get(0));
        assertEquals("First task in progress.",board.getInProgressList().task.get(0));
        assertEquals("First done task.",board.getDoneList().task.get(0));
    }
}
