package com.example.designdemo.factroy;

public class ShapeFactory {

    public static final int CIRCLE =1;
    public static final int RECTANGLE =2;

    public static Shape getShape(int type){

        switch (type){

            case CIRCLE:
                return new Circle();

            case RECTANGLE:
                return new Rectangle();

        }
        return null;
    }
}
