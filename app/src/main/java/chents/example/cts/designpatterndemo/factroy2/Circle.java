package chents.example.cts.designpatterndemo.factroy2;

import android.util.Log;

public class Circle implements Shape {

    private static final String TAG = "Circle";
    @Override
    public void onDraw() {


        Log.d(TAG, "onDraw: ---circle");
    }
}
