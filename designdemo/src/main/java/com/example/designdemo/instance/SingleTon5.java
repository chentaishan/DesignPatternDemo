package com.example.designdemo.instance;

import android.util.Log;

public enum  SingleTon5 {

    INSTANCE;

    public void doSomething(){

        Log.d("SingleTon5", "doSomething: ");
    }
}
