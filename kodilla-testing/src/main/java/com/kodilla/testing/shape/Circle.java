package com.kodilla.testing.shape;

public class Circle implements Shape{
    @Override
    public String getShapeNames() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getField() {
        return 0;
    }
}
