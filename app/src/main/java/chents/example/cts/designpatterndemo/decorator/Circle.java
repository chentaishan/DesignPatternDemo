package chents.example.cts.designpatterndemo.decorator;

import android.util.Log;

public class Circle extends Shape {

    private static final String TAG = "Circle";
    @Override
    public void draw() {

        Log.d(TAG, "draw: circle");
    }
}
