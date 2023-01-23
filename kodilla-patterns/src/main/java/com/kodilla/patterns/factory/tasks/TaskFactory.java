package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "ShoppingTask";
    public static final String PAINTING = "PaintingTask";
    public static final String DRIVING = "DrivingTask";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("Shopping task", "Bread", 2);
            case PAINTING -> new PaintingTask("Painting task", "Red", "Apple");
            case DRIVING -> new DrivingTask("Driving task", "Shop", "Car");
            default -> null;
        };
    }
}

