package com.example.designdemo.observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

public class SingleMan implements Observer {

    private static final String TAG = "SingleMan";
    @Override
    public void update(Observable observable, Object arg) {

        if ( observable instanceof Cuihua){

            String task = ((Cuihua) observable).getTask();

            Log.d(TAG, "update: "+task);
        }

    }
}
