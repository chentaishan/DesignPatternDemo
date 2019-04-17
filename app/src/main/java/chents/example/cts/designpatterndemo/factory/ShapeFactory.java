package chents.example.cts.designpatterndemo.factory;

/**
 * 工厂模式
 */
public class ShapeFactory {

    public   static final String CIRCLE ="CIRCLE";
    public  static final String RECTANGLE ="RECTANGLE";

    public static Shape getShape(String type ){
        if (type.equals(CIRCLE)){
            return new Circle();
        }else if(type.equals(RECTANGLE)){
            return new Rectangle();
        }
        return null;
    }
}
