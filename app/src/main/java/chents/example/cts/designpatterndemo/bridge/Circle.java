package chents.example.cts.designpatterndemo.bridge;

import android.util.Log;

public class Circle extends Shape {

    int x,y;

    public Circle(DrawApi drawApi,int x,int y) {
        super(drawApi);

        this.x = x;
        this.y = y;
    }

    @Override
    public void drawShape() {

        Log.d(TAG, "drawShape: ");
    }

    private static final String TAG = "Circle";
}
