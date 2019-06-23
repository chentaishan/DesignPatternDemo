package com.example.designdemo.factory2;

public class ColorFactroy extends AbstractFactory {
    @Override
    Shape getShape(int type) {
        return null;
    }

    @Override
    Color getColor(int type) {

        switch (type){

            case RED:
                return new Red();
        }


        return null;
    }
}
