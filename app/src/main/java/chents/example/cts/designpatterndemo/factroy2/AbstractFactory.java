package chents.example.cts.designpatterndemo.factroy2;

public abstract class AbstractFactory {

    public abstract Shape getShape(String type);

    public abstract Color getColor(String color);

}
