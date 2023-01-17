package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    List<String> task;

    public TaskList() {
        task = new ArrayList<String>();
    }
    public void addTask(String task){
        this.task.add(task);
    }
}
