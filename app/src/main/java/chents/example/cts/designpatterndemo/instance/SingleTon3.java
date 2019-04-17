package chents.example.cts.designpatterndemo.instance;

/**
 * 静态内部类
 * 优点：实现线程安全，效率高
 *
 */
public class SingleTon3 {
    private SingleTon3(){}

    public static SingleTon3 getInstance(){
        return Holder.singleTon3;
    }

    public static class Holder{
        private static final SingleTon3 singleTon3 = new SingleTon3();
    }
}
