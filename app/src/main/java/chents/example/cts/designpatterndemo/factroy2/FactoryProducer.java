package chents.example.cts.designpatterndemo.factroy2;

/**
 * 工厂生产对象
 */
public class FactoryProducer {

    private static final String SHAPE ="shape";
    private static final String COLOR ="color";

    public static AbstractFactory getFactory(String match){

        if (match.equals(SHAPE)){

            return new ShapeFactory();
        }else{

            return new ColorFactory();
        }

    }
}
