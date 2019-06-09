package chents.example.cts.designpatterndemo.factroy2;

public class ShapeFactory extends AbstractFactory {



    @Override
    public Shape getShape(String type) {
        if (type.equals(Contant.CIRCLE)){

            return new Circle();
        }else if (type.equals(Contant.RECTANGLE)){

            return new Rectangle();
        }

        return null;

    }

    @Override
    public Color getColor(String type) {
        return null;
    }
}
