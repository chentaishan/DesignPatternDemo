package com.example.designdemo;

import java.util.Observable;

public class Cuihua extends Observable {

    private String task;

    public String getTask() {
        return task;
    }


    public void doSomething(String task){
        this.task = task;

        setChanged();
        notifyObservers();

    }
}
