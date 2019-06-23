package com.example.designdemo.factroy;

import android.util.Log;

public class Rectangle implements Shape {
    @Override
    public void onDraw() {
        Log.d("Rectangle", "onDraw: ");
    }
}
