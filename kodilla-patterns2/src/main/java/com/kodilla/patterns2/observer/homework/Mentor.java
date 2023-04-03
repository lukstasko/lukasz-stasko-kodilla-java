package com.kodilla.patterns2.observer.homework;

public class Mentor implements CourseObserver {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(StudentTaskList studentTaskList) {
        System.out.println(name+ " : New task in the list: "+studentTaskList.getStudentName() + "\n"+
                "(Total: " + studentTaskList.getTasks().size()+ " task" + ((studentTaskList.getTasks().size()<2) ? ")":"s)"));
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
