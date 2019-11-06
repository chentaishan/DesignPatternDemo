package chents.example.cts.designpatterndemo.decorator;

/**
 * 装饰着对象 抽象者
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape  shapeDecorator;

    public ShapeDecorator( Shape  shapeDecorator) {
        this.shapeDecorator = shapeDecorator;
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
    }
}
