package chents.example.cts.designpatterndemo.decorator;

import android.util.Log;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        super.draw();
        setBorader();
    }

    public void setBorader(){

        Log.d(TAG, "setBorader: = RED");
    }

    private static final String TAG = "RedShapeDecorator";
}
