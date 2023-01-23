package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Shopping task", shopping.getTaskName());
    }
    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Painting task", painting.getTaskName());
    }
    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("Driving task", driving.getTaskName());
    }

    @Test
    void testIsTaskExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        //When
        shopping.executeTask();
        //Then
        assertTrue(shopping.isExecuted());
        assertFalse(painting.isExecuted());
    }
}

