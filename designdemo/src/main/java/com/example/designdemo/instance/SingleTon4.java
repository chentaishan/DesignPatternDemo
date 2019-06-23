package com.example.designdemo.instance;

import android.util.Log;

public class SingleTon4 {

    private static SingleTon4 singleTon4;


    private SingleTon4(){

    }

    public static  SingleTon4 getInstance(){
        if (singleTon4==null){
            synchronized (SingleTon4.class){

                if (singleTon4==null){
                    return singleTon4 = new SingleTon4();
                }
            }
        }
        return singleTon4;
    }

    public void doSomething() {

        Log.d("single44", "doSomething: ");
    }
}
