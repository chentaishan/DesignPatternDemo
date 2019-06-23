package com.example.designdemo.observer;

import java.util.Observable;

public class Cuihua extends Observable {

    String task;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void doSomething( String task){
        setTask(task);

        setChanged();
        notifyObservers();

    }


}
