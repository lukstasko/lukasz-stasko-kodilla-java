package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task{

    public final String taskName;
    public final String where;
    public final String using;
    public boolean isExecuted;

    public DrivingTask(final String taskName,final String where,final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        isExecuted = false;
    }

    @Override
    public void executeTask() {
        isExecuted=true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isExecuted() {
        return isExecuted;
    }
}
