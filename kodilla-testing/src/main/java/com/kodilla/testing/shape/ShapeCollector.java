package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    List<Shape> shapeList=new ArrayList<>();
    public void addFigure (Shape shape){
        shapeList.add(shape);
    }
    public boolean removeFigure(Shape shape){
       if( shapeList.contains(shape)){
           shapeList.remove(shape);
           return true;
       }else {
           return false;
       }
    }
    public Shape getFigure(int n){
        return shapeList.get(n);
    }

    public String showFigure(){
        String result="";
        for (Shape shape:shapeList){
            result+= shape.getShapeNames();
        }
        return (shapeList.isEmpty() ? null : result );
    }
}
