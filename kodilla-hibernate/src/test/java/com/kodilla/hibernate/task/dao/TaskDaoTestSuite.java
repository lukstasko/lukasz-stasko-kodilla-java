package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskDaoTestSuite {
    @Autowired
    private TaskDao taskDao;
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION="Test: Learn Hibernate";

    @Test
    void testNamedQueries(){
        //Given
        Task task1 = new Task("Test: Study Hibernate", 3);
        Task task2 = new Task("Test: Practice Named Queries", 6);
        Task task3 = new Task("Test: Study native queries", 7);
        Task task4 = new Task("Test: Makse some tests", 13);

        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(5), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        TaskFinancialDetails tfd3 = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd4 = new TaskFinancialDetails(new BigDecimal(15), false);

        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        task3.setTaskFinancialDetails(tfd3);
        task4.setTaskFinancialDetails(tfd4);

        TaskList taskList=new TaskList("TODO","ToTo task");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        taskList.getTasks().add(task3);
        taskList.getTasks().add(task4);

        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        task3.setTaskList(taskList);
        task4.setTaskList(taskList);

        taskListDao.save(taskList);
        int id= taskList.getId();

        //When
        List<Task> longTask=taskDao.retrieveLongTasks();
        List<Task> shortTask=taskDao.retrieveShortTasks();
        List<Task> enoughTimeTask=taskDao.retrieveTasksWithEnoughTime();
        List<Task> durationLongerThanTasks=taskDao.retrieveTaskWithDurationLongerThen(6);

        //Then
        try{
            assertEquals(1,longTask.size());
            assertEquals(3,shortTask.size());
            assertEquals(3,enoughTimeTask.size());
            assertEquals(2,durationLongerThanTasks.size());
        }finally{
            //CleanUp
            taskListDao.deleteById(id);
        }


    }


    @Test
    void testTaskListDaoSaveWithTasks(){
        //Given
        Task task=new Task("Test: Learn Hibernate",14);
        Task task2=new Task("Test:  Write some entities",3);
        TaskFinancialDetails tfd=new TaskFinancialDetails(new BigDecimal(20),false);
        TaskFinancialDetails tfd2=new TaskFinancialDetails(new BigDecimal(10),false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList=new TaskList("LISTNAME","ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);
        //When
        taskListDao.save(taskList);
        int id=taskList.getId();


        //Then
        assertNotEquals(0,id);

        //CleanUp
        taskListDao.deleteById(id);


    }
    @Test
    void testTaskDaoSaveWithFinancialDetails(){
    //Given
    Task task=new Task(DESCRIPTION,30);
    task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120),false));

    //When
    taskDao.save(task);
    int id=task.getId();

    //Then
    assertNotEquals(0,id);
    //CleanUp
        taskDao.deleteById(id);

    }

    @Test
    void testTaskDaoSave(){
        //Given
        Task task=new Task(DESCRIPTION,7);

        //When
        taskDao.save(task);

        //Then
        int id= task.getId();
        Optional<Task> readTask=taskDao.findById(id);
        assertTrue(readTask.isPresent());

        //CleanUp
        taskDao.deleteById(id);
    }

    @Test
    void testTaskDaoFindByDuration(){
        //Given
        Task task=new Task(DESCRIPTION,7);
        taskDao.save(task);
        int duration=task.getDuration();
        int id=task.getId();

        //When
        List<Task> readTask=taskDao.findByDuration(duration);

        //Then
        assertEquals(2,readTask.size());

        //CleanUp
        taskDao.deleteById(id);
    }

}
