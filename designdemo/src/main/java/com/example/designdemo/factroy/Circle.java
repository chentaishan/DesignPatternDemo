package com.example.designdemo.factroy;

import android.util.Log;

public class Circle implements Shape {
    @Override
    public void onDraw() {
        Log.d("Circle", "onDraw: ");
    }
}
