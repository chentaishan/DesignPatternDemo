package chents.example.cts.designpatterndemo.factroy2;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        return null;
    }

    @Override
    public Color getColor(String type) {
        if (type.equals(Contant.RED)){
            return new Red();
        }else if(type.equals(Contant.GREEN)){
            return new Green();
        }
        return null;
    }
}
