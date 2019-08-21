package com.example.designdemo.factory2;

public abstract class AbstractFactory {

    public static final int GREEN =0;
    public static final int RED =1;
    public static final int CIRCLE =0;
    public static final int  RETACGLE=1;


    abstract Shape getShape(int type);
    abstract Color getColor(int type);
}
