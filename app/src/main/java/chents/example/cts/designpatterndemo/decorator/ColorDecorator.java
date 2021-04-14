package chents.example.cts.designpatterndemo.decorator;

import android.util.Log;

public abstract class ColorDecorator extends Shape {

    protected Shape shape;
    public ColorDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }

    private static final String TAG = "RedShapeDecorator";
}
