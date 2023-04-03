package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTaskListTestSuite {

    @Test
    public void testUpdate(){
        //Given
        Mentor mentor1=new Mentor("Mentor 1");
        Mentor mentor2=new Mentor("Mentor 2");
        StudentTaskList student1TaskList=new StudentTaskList("Student 1");
        StudentTaskList student2TaskList=new StudentTaskList("Student 2");
        StudentTaskList student3TaskList=new StudentTaskList("Student 3");
        student1TaskList.registerObserver(mentor1);
        student2TaskList.registerObserver(mentor2);
        student3TaskList.registerObserver(mentor1);
        //When
        student1TaskList.add("Student 1, Task 1");
        student2TaskList.add("Student 2, Task 1");
        student3TaskList.add("Student 3, Task 1");
        student2TaskList.add("Student 2, Task 2");
        student2TaskList.add("Student 2, Task 3");
        //Then
        assertEquals(2,mentor1.getUpdateCount());
        assertEquals(3,mentor2.getUpdateCount());
    }
}
