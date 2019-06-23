package com.example.designdemo.builder;

public abstract class Computer {

    public String os;
    public String broad;
    public String display;

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", broad='" + broad + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
