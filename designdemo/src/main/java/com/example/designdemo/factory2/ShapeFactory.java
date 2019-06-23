package com.example.designdemo.factory2;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(int type) {
        switch (type){
            case CIRCLE:
                return new Circle();
        }
        return null;
    }

    @Override
    Color getColor(int type) {
        return null;
    }
}
