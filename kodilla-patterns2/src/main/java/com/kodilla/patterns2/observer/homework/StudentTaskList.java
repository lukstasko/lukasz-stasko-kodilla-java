package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTaskList implements CourseObservable {
    private final List<CourseObserver> observers;
    private final String studentName;
    private final List<String> tasks;

    public StudentTaskList(String studentName) {
        observers=new ArrayList<>();
        tasks=new ArrayList<>();
        this.studentName = studentName;
    }
    public void add(String task){
        tasks.add(task);
        notifyObservers();
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void registerObserver(CourseObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(CourseObserver observer:observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(CourseObserver observer) {
        observers.remove(observer);
    }
}
