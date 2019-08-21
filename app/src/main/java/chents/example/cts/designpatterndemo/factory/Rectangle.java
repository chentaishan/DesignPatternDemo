package chents.example.cts.designpatterndemo.factory;

import android.util.Log;

public class Rectangle implements Shape {

    private static final String TAG = "Rectangle";
    @Override
    public void onDraw() {

        Log.d(TAG, "onDraw: ");
    }
}
