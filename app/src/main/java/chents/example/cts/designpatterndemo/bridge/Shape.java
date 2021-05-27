package chents.example.cts.designpatterndemo.bridge;

public abstract class Shape {
    private DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void drawShape();
}
