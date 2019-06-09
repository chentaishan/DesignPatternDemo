package com.example.designdemo;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

public class SingleMan implements Observer {


    private  final String TAG = hashCode()+"";

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof Cuihua){

            final String task = ((Cuihua) o).getTask();


            Log.d(TAG, "update: "+task);
        }
    }
}
