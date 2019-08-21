package com.example.designdemo.instance;

public class SingleTon3 {

    private SingleTon3(){}

    private static class Holder{

        private static SingleTon3 singleTon3 = new SingleTon3();
    }

    public static synchronized SingleTon3 getInstance(){

        return Holder.singleTon3;

    }

    public void doSomething(){


    }
}
