package chents.example.cts.designpatterndemo.decorator;

import android.util.Log;

public class Rectangle implements Shape {

    private static final String TAG = "Rectangle";
    @Override
    public void draw() {

        Log.d(TAG, "draw: Rectangle");
    }
}
