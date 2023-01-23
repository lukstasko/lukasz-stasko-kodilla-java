package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task{

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isExecuted;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isExecuted =false;
    }

    @Override
    public void executeTask() {
        isExecuted =true;
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
