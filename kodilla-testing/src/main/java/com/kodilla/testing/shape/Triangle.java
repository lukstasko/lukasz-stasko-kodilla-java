package com.kodilla.testing.shape;

public class Triangle implements Shape{

    public String getShapeNames() {
        return this.getClass().getSimpleName();
    }

    public double getField() {
        return 0;
    }
}
