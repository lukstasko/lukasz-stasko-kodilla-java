package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskList1DaoTestSuite {

    @Autowired
    TaskListDao1 taskListDao;

    private static final String LISTNAME="Test list.";
    private static final String DESCRIPTION="Description of test list.";

    @Test
    void testFindByListName(){
        //Given
        TaskList1 taskList1 =new TaskList1(LISTNAME,DESCRIPTION);
        taskListDao.save(taskList1);

        //When
        List<TaskList1> resultList=taskListDao.findByListName(LISTNAME);

        //Then
        assertEquals(1,resultList.size());
        assertEquals(DESCRIPTION,resultList.get(0).getDescription());

        //Cleanup
        taskListDao.delete(taskList1);
    }

}
